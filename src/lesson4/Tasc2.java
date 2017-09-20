/*Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
* В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
*/
package lesson4;

import java.util.Scanner;

public class Tasc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        int a;
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            blinkNTimes(a);//  a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~)
            ticker(a);//б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>)
            onOf(a); //метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &)
            real(a); //метод который будет распечатывать текущее состояние гирлянды
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
        return;
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
        return;
    }

    public static void onOf(int a) {
        int maska = 1;
        int result = a & maska;
        if (result == 1) {
            System.out.println("На первой позиции лампочка включена");
        } else {
            System.out.println("На первой позиции лампочка вылючена");
        }
        return;
    }

    public static void real(int a) {
        System.out.println("Текущее состояние гирлядны " + Integer.toBinaryString(a) + " =" + a);
        return;
    }
}


