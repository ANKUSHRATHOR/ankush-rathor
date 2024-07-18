import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter any number for factorial:");
        int num = user_input.nextInt();
        int result = 1;
        // Correct loop to start at 1
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("The factorial of " + num + " is: " + result);
        user_input.close();
    }
}
