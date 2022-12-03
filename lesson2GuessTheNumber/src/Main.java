import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Your task is quess the number.");
        for (int i = 10; i <= 100; i += 10) playLevel(i);
        scanner.close();
        System.out.println("You are win!");
    }

    private static void playLevel (int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Guess the number from zero to " + range);
            int answer = scanner.nextInt();
            if (answer == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (answer > number) {
                System.out.println("The entered number is greater than the given number");
            } else {
                System.out.println("The entered number is less than the given number");
            }
        }
    }
}