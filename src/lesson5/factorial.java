package lesson5;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int i1, i2, random_number, n;
        long factorial_n = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте диапазон для генерации случайного целого числа");
        System.out.println("Начало диапазона");
        i1 = scanner.nextInt();
        System.out.println("Конец диапазона");
        i2 = scanner.nextInt();
        random_number = i1 + (int) (Math.random() * i2);
        System.out.println("Cлучайное число " + random_number);
        for (n = 1; n < random_number + 1; n++) {
            factorial_n *= n;
            //System.out.print(n+" * ");
        }
        System.out.println("Факториал числа " + random_number + " = " + factorial_n);
    }
}
