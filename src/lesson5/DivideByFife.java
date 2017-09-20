package lesson5;

public class DivideByFife {
    public static void main(String[] args) {
        int n = 0;
        do {
            n++;
            if (n % 5 == 0) {
                System.out.println(n);
            }
        } while (n < 100);
    }
}
