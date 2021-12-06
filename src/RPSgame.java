import java.util.Scanner;
import java.util.Random;

public class RPSgame {
    public static void main(String[] args){
        Scanner gir = new Scanner(System.in);
        Random rastgele = new Random();
        int userWin = 0;
        int compWin = 0;
        int deuceTime = 0;
        System.out.println("Welcome to Rock-Paper-Scissor Game\nYour rival is computer.\nEnter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissor");
        while (compWin != 5  && userWin !=5){
            System.out.println("Please enter your choice: ");
            String userChoice = "";
            String compChoice;
            boolean a = false;
            int userInput = gir.nextInt();
            int compInput = rastgele.nextInt(3); //0 for rock, 1 for paper, 2 for scissor
            while (true) {
                compChoice = switch (compInput) {
                    case 0 -> "Rock";
                    case 1 -> "Paper";
                    default -> "Scissor";
                };
                switch (userInput) {
                    case 1 -> userChoice = "Rock";
                    case 2 -> userChoice = "Paper";
                    case 3 -> userChoice = "Scissor";
                    default -> {
                        System.out.println("Please enter a valid number!");
                        a = true;
                    }
                }
                if (a){
                    break;
                }
                if ((userInput == 1 & compInput == 2) || (userInput == 2 & compInput == 0) || (userInput == 3 & compInput == 1)) {
                    System.out.printf("You win!\n Your choice: %s \n Computer Choice: %s%n", userChoice, compChoice);
                    userWin++;
                    break;
                } else if ((compInput == 0 & userInput == 3) || (compInput == 1 & userInput == 1) || (compInput == 2 & userInput == 2)) {
                    System.out.printf("You lost!\n Your choice: %s \n Computer Choice: %s%n", userChoice, compChoice);
                    compWin++;
                    break;
                } else if (compInput == userInput-1) {
                    System.out.printf(("Its deuce! Your answers: %s%n"), userChoice);deuceTime++;
                    break;
                }
            }

        }
        if (userWin == 5){
            System.out.printf(("You win the Rock-Paper-Scissor game by beating computer!\n You won: 5 times! \n Computer won: %s times \n Computer and you gave the same answer: %s times%n"),compWin,deuceTime);
        } else{
            System.out.printf(("You lost to computer in the game Rock-Paper-Scissor\n Computer won: 5 times! \n You won: %s times\n Computer and you gave the same answer: %s times%n"),userWin,deuceTime);
        }

    }
}

//Coded by Nuh Yiğit Akman (Rhalith)
//I used extra source for printf method which is https://www.baeldung.com/java-printstream-printf
