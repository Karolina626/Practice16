package game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {
        Poole();
    }
    public static void Poole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть куди записувати налаштування: ");
        String name = sc.nextLine();
        System.out.println("Введіть ім'я першого гравця(X): ");
        String kor = sc.nextLine();
        System.out.println("Введіть ім'я другого гравця(0): ");
        String kor2 = sc.nextLine();
        LocalDateTime now = LocalDateTime.now();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(name))){
            char[][] mass = new char[4][4];
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    mass[i][j] = ' ';
                }
            }
            bw.write("Розмір поля: 3" + "\n" + "Ім'я першого гравця:" + kor + "\n" + "Ім'я другого гравця:" + kor2 + "\n" + now);
            bw.close();
            Gra.set(mass,3,kor,kor2);
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
