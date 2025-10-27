package project;

import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuesserNumb() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guesser kindly Guess a Number : ");
        GuesserNum = scan.nextInt();

        return GuesserNum;
    }
}

class Player {
    int PlayerNum;
    public int PlayerNumb() {
        Scanner scan = new Scanner(System.in);
        PlayerNum = scan.nextInt();

        return PlayerNum;
    }
}

class Umpire {
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumFromGuesser() {
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNumb();
    }

    public void CollectNumFromPlayer() {
        System.out.print("Player1 kindly Guess a Number : ");
        Player P1 = new Player();
        Playernum1 =  P1.PlayerNumb();

        System.out.print("Player2 kindly Guess a Number : ");
        Player P2 = new Player();
        Playernum2 =  P2.PlayerNumb();

        System.out.print("Player3 kindly Guess a Number : ");
        Player P3 = new Player();
        Playernum3 =  P3.PlayerNumb();
    }

    public void Compare() {
        System.out.print("Result :");
        if (Guessernum == Playernum1) {
            if (Guessernum == Playernum2 && Guessernum == Playernum3){
                System.out.println("All Players Won the Game.");
            }
            else if (Guessernum == Playernum2){
                System.out.println("Player 1 and Player 2 won the Game.");
            }
            else if (Guessernum == Playernum3){
                System.out.println("Player 1 and Player 3 won the Game.");
            }
            else {
                System.out.println("Only Player 1 won the Game.");
            }
        }
        else if (Guessernum == Playernum2){
            if (Guessernum == Playernum3){
                System.out.println("Player 2 and Player 3 won the Game.");
            }
            else {
                System.out.println("Only Player 2 won the Game.");
            }
        }
        else if(Guessernum == Playernum3) {
            System.out.println("Only Player 2 won the Game.");
        }
        else {
            System.out.println("No Player won the Game.");
        }
    }
}


public class Guesser_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rounds You want to Play :");
        int n = sc.nextInt();

        int i=0;
        System.out.println("<----- Game Started ----->");
        while (i++<n) {
            System.out.println("Round "+ (i));
            Umpire ump = new Umpire();
            ump.CollectNumFromGuesser();
            ump.CollectNumFromPlayer();
            ump.Compare();
        }

        System.out.println("<----- Game Over ----->");
    }
}
