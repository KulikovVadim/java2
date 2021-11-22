import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 1;
        long factorial = 1;
        System.out.print("Введите число от 1 до 15 - ");
        if (scanner.hasNextInt()) {
            int chislo = scanner.nextInt();
            if (chislo <= 15 && chislo >= 0) {
                while (temp <= chislo) {
                    factorial = factorial * temp;
                    temp += 1;
                }
                System.out.println(" Факториал числа " + chislo + " = " + factorial);
            } else {
                System.out.println("Ошибка, пожалуйста введите число из указанного диапазона от 1 до 15");
            }
        } else {
            System.out.println("Ошибка, пожалуйста введите число из указанного диапазона от 1 до 15");
        }
    }
}
