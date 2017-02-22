/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Ethan Ta
 */
import java.util.Scanner;
public class Player {
    private Scanner scan = new Scanner (System.in);
    private String name;
    private int score;
    private Hand hand;

    public Player(int s,Hand h) {
        System.out.print("What is the Player's Name: ");
        name = scan.nextLine();
        hand = h;
    }

    public void changeName(String changeN) {
        name = changeN;
    }

    public void changeScore(int changeS) {
        score = changeS;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    public Hand getHand(){
        return hand;
    }

    public String toString(){
        String contents = name + " Score (" + score + ") : ";
        contents += hand;
        return contents;
    }
}