package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        menushka();
    }
    public static void menushka() {
    String gl = "~Головне меню~";
    String play = "~1.Грати(Нова гра)~";
    String settings = "~2.Налаштування~";
    String perevirka = "~3.Статистика~";
    String exit = "~4.Вихід~";
    String str = gl + "\n" + play + "\n" + settings + "\n" + perevirka + "\n" + exit + "\n";
        System.out.println(str);

    Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть функцію: ");
    boolean func = scanner.hasNextInt();
        while (!func) {
        System.out.println("Ви ввели не вірне значення.");
        scanner.next();
        func = true;
    }
        while (true) {
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Ви обрали: " + play);
            Pool.Poole();
        } else if (a == 2) {
            System.out.println("Ви обрали: " + settings);
            FullPool.Poole();
        } else if (a == 3) {
            System.out.println("Ви обрали: " + perevirka);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть назву файла який хочете перевірити: ");
            String s = sc.nextLine();
            reader(s);
        } else if (a == 4) {
            System.out.println("Ви обрали :" + exit);
            break;
        }
    }
}
    public static void reader(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println();
            menushka();
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
