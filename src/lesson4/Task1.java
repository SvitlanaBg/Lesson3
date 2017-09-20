//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел. Для вычисления модуля используйте тернарную условную операцию.
package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект класса Scanner
        int int1, int2, int3;
        System.out.println("Введите три целых числа");
        if (scanner.hasNextInt()) {// возвращает истину если с потока ввода можно считать целое число
            int1 = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int2 = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int3 = scanner.nextInt();
                    int i1 = int1 > int2 ? int2 : int1;
                    int i2 = i1 > int3 ? int3 : i1;
                    System.out.println("Меньшее по модулю число " + i2);
                }
            }
        } else {
            System.out.println("Вы ввели не целые чила");
        }
    }
}
