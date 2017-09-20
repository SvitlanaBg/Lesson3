package lesson5;

import java.util.Scanner;

public class garland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        int a, option;
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.println("Введите число от 1 до 4, в соответсвии с выбранным вариантом:");
            System.out.println("1. метод который будет мигать лампочками гирлянды заданное количество раз (операция ~)");
            System.out.println("2. метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>)");
            System.out.println("3. метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &)");
            System.out.println("4.метод который будет распечатывать текущее состояние гирлянды");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    blinkNTimes(a);//  a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~)
                    break;
                case 2:
                    ticker(a);//б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>)
                    break;
                case 3:
                    onOf(a); //метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &)
                    break;
                case 4:
                    real(a); //метод который будет распечатывать текущее состояние гирлянды
                    break;
                default:
                    System.out.println("Неправильный ввод");

            }
        } else {
            System.out.println("Неправильный ввод");
        }
    }

    public static void blinkNTimes(int a) {
        System.out.println("Введите количество повторений");
        int b, i;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
            for (i = 0; i < b; i++) {
                System.out.println(Integer.toBinaryString(a));
                System.out.println(Integer.toBinaryString(~a));
            }
        } else {
            System.out.println("Неправильный ввод");
        }
    }

    public static void ticker(int a) {
        int c, direct, i;
        System.out.println("Введите число сдвигов");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            c = scanner.nextInt();
            System.out.println("Введите направление движения: вправо - 1, влево - 2");
            direct = scanner.nextInt();
            System.out.println("Ваше число " + Integer.toBinaryString(a));
            if (direct == 1)
                for (i = 0; i < c; i++) {
                    a = a >> 1;
                    System.out.println(Integer.toBinaryString(a));
                }
            else {
                for (i = 0; i < c; i++) {
                    a = a << 1;
                    System.out.println(Integer.toBinaryString(a));
                }
            }
        }
    }

    public static void onOf(int a) {
        int maska = 1;
        int result = a & maska;
        if (result == 1) {
            System.out.println("На первой позиции лампочка включена");
        } else {
            System.out.println("На первой позиции лампочка вылючена");
        }
    }

    public static void real(int a) {
        System.out.println("Текущее состояние гирлядны " + Integer.toBinaryString(a) + " =" + a);
    }
}
