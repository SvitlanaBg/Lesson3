package lesson4;
/* Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов. Используйте цикл for, пример.
* Для преобразования из String в double используйте метод Double.parseDouble(String s).
*/
public class Task3 {
    public static void main(String[] args) {
        int count = 1;
        double summa = 0;
        for (String str : args) {
            Double d = Double.parseDouble(str);
            System.out.println(count++ + " аргумент = " + str);
            summa+=d;
        }
        System.out.println("Среднее значение = "+ summa/((double) count));
    }
}
