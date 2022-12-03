import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the operation:");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        int result;
        if (operation == 1){
            result = num1 + num2;
        } else if (operation == 2) {
            result = num1 - num2;
        } else if (operation == 3) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        System.out.println("Result of operation = " + result);
    }
}