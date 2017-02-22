/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ethan Ta
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Player> Players = new ArrayList<Player>();
        Deck deck1 = new Deck();
        int playerCount = 0;
        String temp = "";
        boolean ongoing = true;

        System.out.println("How many players do you want?: (1-3) ");
        playerCount = scan.nextInt();
        int [] roundScore = new int[playerCount];
        while (playerCount < 1 || playerCount > 3) {
            System.out.println("Player Number?: (1-3) ");
            playerCount = scan.nextInt();
            roundScore = new int[playerCount];
        }
        for (int i = 0; i < playerCount; i++) {
            Hand hand1 = new Hand(deck1.deal());
            Player player1 = new Player(0, hand1);
            Players.add(player1);
            System.out.println(player1);
        }
        System.out.println(Players.get(0).getName());

        while (ongoing) {
            for (int k = 0; k < playerCount; k++) {
                if (Players.get(k).getScore() > 10) {
                    System.out.println("The Winner is : " + Players.get(k).getName());
                    ongoing = false;
                }
            }
            for (int j = 0; j < playerCount; j++) {
                System.out.println("Here is Your Hand: " + Players.get(j).getHand() + "\n");
                System.out.println("Here are your options: " + "\n" + "____________________________________________");
                System.out.println("Press 1 : " + "\t" + "Replace and Draw a Card" + "\n"
                                 + "Press 2 : " + "\t" + "Keep Your Hand");
                int choice = scan.nextInt();
                if (choice == 1) {
                    Players.get(j).getHand().discardAndDraw(Players.get(j).getHand(), deck1);
                    System.out.println("Hand: " + Players.get(j).getHand());
                } else{

                }
                System.out.println("Which two cards would you like to send into battle?: ");
                System.out.println("First Card?: ");
                int card1 = scan.nextInt();
                System.out.println("Second Card?: ");
                int card2 = scan.nextInt();
                roundScore[j] = Players.get(j).getHand().getCard(card1-1).getValue() * Players.get(j).getHand().getCard(card2-1).getValue();
                System.out.println("total: " + roundScore[j]);
                Players.get(j).getHand().nextTurn(Players.get(j).getHand(), deck1, card1);
                Players.get(j).getHand().nextTurn(Players.get(j).getHand(), deck1, card2);
            }
            for (int j = 0; j < playerCount; j++){
                int roundWin = roundScore[j];
                int playerWin = 0;
                if (roundScore[j] > roundWin){
                    roundWin = roundScore[j];
                    playerWin = j;
                }
                if (j = playerCount){
                    Players.get(playerWin).changeScore();
                }
            }
        }
    }
}
