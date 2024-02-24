import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение 1 и нажмите <Enter> :");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите значение 2 и нажмите <Enter> :");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("Сумма : " + (number + number2));
        System.out.println("Разность : " + (number - number2));
        System.out.println("Произведение : " + (number * number2));
        System.out.println("Частное: " + ((double) number / number2));
    }
}
