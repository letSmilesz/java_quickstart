import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your task is quess the number.");
        int range = 100;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Quess the number from zero to " + range);
            int answer = scanner.nextInt();
            if (answer == number) {
                break;
            } else if (answer > number) {
                System.out.println("The entered number is greater than the given number");
            } else {
                System.out.println("The entered number is less than the given number");
            }
        }
        System.out.println("Вы угадали!");
        scanner.close();
    }
}