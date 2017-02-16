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
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        System.out.println(deck1);
        Hand hand1 = new Hand(deck1.deal());
        System.out.println(deck1.toString());
        //deck1.shuffle();

        System.out.println(hand1);

    }
}
