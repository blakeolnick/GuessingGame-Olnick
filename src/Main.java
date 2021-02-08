import java.util.Random;
import java.util.Scanner;
String again;
public class Main {

    public static void main(String[] args) {

        int playerNumber, computerNumber;
        Random rand = new Random();
        Scanner read = new Scanner(System.in);

        do {

            computerNumber = rand.nextInt(99) + 1;

            do {
                System.out.println("Please guess a number from 1 to 100");

                playerNumber = read.nextInt();
                read.nextLine();

                if (computerNumber == playerNumber) {
                    System.out.println("Correct!");
                } else if (computerNumber > playerNumber) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }
            } while (computerNumber != playerNumber);
            System.out.println("Would you like to play again? Y or N");
            again = read.nextLine();

        }while(again.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
