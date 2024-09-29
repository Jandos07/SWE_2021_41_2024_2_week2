package Task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int rand_num = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        while (true) {
            attempts += 1;
            System.out.print("Enter a number between 1 and 100(-1 to give up) : ");
            guess = sc.nextInt();
            String hint;
            if (guess == -1) {
                System.out.println("Fail to guess the target number!");
                endGame(attempts);
                break;
            }
            
            if (guess == rand_num) {
                System.out.println("\nCorrect Number!");
                System.out.println("Guess Count: "+ attempts);
                endGame(attempts);
                break;
            }
            else if (guess > rand_num) hint = "lower";
            else hint = "higher";
            System.out.println("Target Number is "+hint+" than your guess number!");
        }

        sc.close();
    }

    public static void endGame(int attempts) {
        if (attempts > 7) System.out.println("Oops! Computer wins!");
        else System.out.println("Congratulations! Player wins!");
    }
    
}
