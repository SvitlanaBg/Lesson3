package lesson5;

public class Week {
    public static void main(String[] args) {
        methodWeek(args);
    }

    public static void methodWeek(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i == 1) {
            System.out.println("Понедельник");
        } else if (i == 2) {
            System.out.println("Вторник");
        } else if (i == 3) {
            System.out.println("Среда");
        } else if (i == 4) {
            System.out.println("Четверг");
        } else if (i == 5) {
            System.out.println("Пятница");
        } else if (i == 6) {
            System.out.println("Суббота");
        } else if (i == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Неправильный ввод");
        }
    }
}

