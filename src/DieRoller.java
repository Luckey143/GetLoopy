import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            // Print header
            System.out.println("Roll\t\tDie1\t\tDie2\t\tDie3\t\tSum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            boolean isTriple = false;

            // Roll dice until we get a triple
            while (!isTriple) {
                rollCount++;

                // Generate 3 random die values (1-6)
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print the roll information
                System.out.printf("%4d\t\t%d\t\t%d\t\t%d\t\t%d\n",
                        rollCount, die1, die2, die3, sum);

                // Check if we have a triple
                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                    System.out.println("\nYou got a triple!");
                }
            }

            // Ask if the user wants to play again
            System.out.print("\nDo you want to roll again? (y/n): ");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("y") || response.equals("yes");

            if (playAgain) {
                System.out.println("\n");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
