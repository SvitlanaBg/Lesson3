package lesson6;

/**
 * Создать массив типа String с размером 7.
 * Записать в него значения дней недели. Вывести на консоль значение последнего элемента.
 */
public class ArrayOne {
    public static void main(String[] args) {
        String[] day = new String[7];
        day[0] = "Понедельник";
        day[1] = "Вторник";
        day[2] = "Среда";
        day[3] = "Четверг";
        day[4] = "Пяница";
        day[5] = "Суббота";
        day[6] = "Воскресенье";
        System.out.println(day[6]);
    }
}


