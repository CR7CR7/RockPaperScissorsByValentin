import java.util.Scanner;
import java.util.*;
public class RockPaperScissors {
    private static final String ROCK ="Rock";
    private static final String PAPER ="Paper";
    private static final String SCISSORS ="Scissors";

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper, or [s]cissors: ");
        String playerMove =scan.nextLine();
        Random random = new Random();
        int computerRandomNumber =random.nextInt(4);
        String computerMove = " ";
        switch(computerRandomNumber){
            case 1:
                computerMove ="Rock";
                System.out.printf("The computer choose: %s.%n",computerMove);
                break;
            case 2:
                computerMove ="Paper";
                System.out.printf("The computer choose: %s.%n",computerMove);
                break;
            case 3:
                computerMove ="Scissors";
                System.out.printf("The computer choose: %s.%n",computerMove);
                break;

        }
        if((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(PAPER) && (computerMove.equals(ROCK)) ||
                (playerMove.equals(SCISSORS) && (computerMove.equals(PAPER))
                ))){
            System.out.println("You win.");
                } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
                            (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) ||
                             (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))){
                   System.out.println("You lose.");

           } else {
                  System.out.println("This game was a draw.");

        }


        if(playerMove.equals("r") || (playerMove.equals("rock"))){
            playerMove =ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove =PAPER;
        } else if (playerMove.equals("s")|| playerMove.equals("scissors")){
            playerMove =SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

    }
}