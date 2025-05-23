package game;

import java.util.Scanner;

public class Gra {
    public static void set(char mass[][],int size, String kor, String kor2) {
        Scanner sc = new Scanner(System.in);
        char X = 'X';
        int m = 0;
        while (true) {
            for (int c = 0; c < mass.length; c++) {
                System.out.print(c + " \t");
            }
            System.out.println();
            for (int i = 1; i < mass.length; i++) {
                System.out.print("  ");
                for (int j = 0; j < mass.length; j++) {
                    System.out.print("----");
                }
                System.out.println();

                System.out.print(i + " ");
                for (int j = 1; j < mass.length; j++) {
                    System.out.print("| " + mass[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.print("  ");
            for (int b = 0; b < mass.length; b++) {
                System.out.print("----");
            }
            System.out.println();
            System.out.println("Введіть стрічку куди поставити(якщо хочете повернутися на головне меню введіть 0): ");
            int f = sc.nextInt();
            System.out.println("Введіть стовбець куди поставити(якщо хочете повернутися на головне меню введіть 0): ");
            int s = sc.nextInt();
            boolean win = false;
            if (!win) {
                if (mass[f][s] == ' ') {
                    mass[f][s] = X;
                } else {
                    System.out.println("Ця клітина вже зайнята");
                    continue;
                }
                if (mass[f][1] == X && mass[f][2] == X && mass[f][3] == X) {
                    if(X == 'X') {
                        Win(kor);
                    } else {
                        Win1(kor2);
                    }
                } else if (mass[1][s] == X && mass[2][s] == X && mass[3][s] == X) {
                    if(X == 'X') {
                        Win(kor);
                    } else {
                        Win1(kor2);
                    }
                } else if (mass[1][1] == X && mass[2][2] == X && mass[3][3] == X) {
                    if(X == 'X') {
                        Win(kor);
                    } else {
                        Win1(kor2);
                    }
                } else if (mass[2][1] == X && mass[2][2] == X && mass[1][3] == X) {
                    if(X == 'X') {
                        Win(kor);
                    } else {
                        Win1(kor2);
                    }
                } else if (size == 3) {
                    if (m == 9)
                        System.out.println("Нічия");
                } else if (size == 5) {
                    if (m == 25)
                        System.out.println("Нічия");
                } else if (size == 7) {
                    if(m == 49)
                        System.out.println("Нічия");
                } else if(size == 9) {
                    if(m == 81) {
                        System.out.println("Нічия");
                    }
                }
                X = (X == 'X') ? '0' : 'X';
            }
            if (s == 0 && f == 0) {
                System.out.println("Ви обрали повернутися на головне меню ");
                Menu.menushka();
            }
        }
    }
    public static void Win(String kor) {
        System.out.println("WINNER WINNER CHICKEN DINNER: " + kor);
    }
    public static void Win1(String kor2) {
        System.out.println("WINNER WINNER CHICKEN DINNER: " + kor2);
    }
}
