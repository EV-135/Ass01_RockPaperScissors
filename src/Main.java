import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pOne;
        String pTwo;
        String playAgain;
        boolean stop=false;
        boolean valid=false;
        boolean valTwo=false;
        boolean valThree=false;

        do {
            valThree = false;
            System.out.println("Welcome to Rock, Paper, Scissors!");
            do {
                System.out.println("Player 1, what is your move? [R,P,S]");
                pOne = in.nextLine();
                if (pOne.equals("R") || pOne.equals("r")) {

                    valid = true;

                } else if (pOne.equals("P") || pOne.equals("p")) {

                    valid = true;

                } else if (pOne.equals("S") || pOne.equals("s")) {

                    valid = true;

                } else {
                    System.out.println("Invalid input, try again.");
                }

            } while (!valid);

            do {
                System.out.println("Player 2, what is your move? [R,P,S]");
                pTwo = in.nextLine();
                if (pTwo.equals("R") || pTwo.equals("r")) {

                    valTwo = true;

                } else if (pTwo.equals("P") || pTwo.equals("p")) {

                    valTwo = true;

                } else if (pTwo.equals("S") || pTwo.equals("s")) {

                    valTwo = true;

                } else {
                    System.out.println("Invalid input, try again.");
                }

            } while (!valTwo);

            if (pOne.equals("R") || pOne.equals("r")) {
                if (pTwo.equals("R") || pTwo.equals("r")) {
                    System.out.println("Rock vs. Rock, it's a tie!");
                } else if (pTwo.equals("P") || pTwo.equals("p")) {
                    System.out.println("Paper covers Rock, Player 2 wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player 1 wins!");
                }
            } else if (pOne.equals("P") || pOne.equals("p")) {
                if (pTwo.equals("R") || pTwo.equals("r")) {
                    System.out.println("Paper covers Rock, Player 1 wins!");
                } else if (pTwo.equals("P") || pTwo.equals("p")) {
                    System.out.println("Paper vs. Paper, it's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper, Player 2 wins!");
                }
            } else {
                if (pTwo.equals("R") || pTwo.equals("r")) {
                    System.out.println("Rock breaks Scissors, Player 2 wins!");
                } else if (pTwo.equals("P") || pTwo.equals("p")) {
                    System.out.println("Scissors cuts Paper, Player 1 wins!");
                } else {
                    System.out.println("Scissors vs. Scissors, it's a tie!");
                }
            }

            do {
                System.out.println("Would you like to play again?");
                playAgain = in.nextLine();
                if (playAgain.equals("Y") || playAgain.equals("y")) {
                    System.out.println(" ");
                    valThree = true;
                } else if (playAgain.equals("N") || playAgain.equals("n")) {
                    System.out.println("Goodbye!");
                    valThree = true;
                    stop = true;
                } else {
                    System.out.println("that is not a valid input");
                }
            }while(!valThree);
        }while(!stop);
    }
}