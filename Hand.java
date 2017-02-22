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
public class Hand {

    private Card[] cards;
    private Card[] tempcards;
    private ArrayList<Card> temp = new ArrayList<Card>();
    private Scanner scan = new Scanner(System.in);

    public Hand(Card[] cards) {
        this.cards = cards;
        this.sortHand();
    }

    public void sortHand() {
        Card.insertionSort(cards, 5);
    }

    public void discardAndDraw(Hand current, Deck deck) {
        //Discards a Card
        int position = 0;
        System.out.println("Which Card Would you like to Discard? (1-5): ");
        position = scan.nextInt();
        while (position < 1 || position > 5) {
            System.out.println("Card to Discard? (1-5): ");
            position = scan.nextInt();
        }
        deck.getDeckOfCards().add(current.cards[position - 1]);
        current.cards[position - 1] = null;
        //Draws a Card
        current.cards[position - 1] = deck.getDeckOfCards().remove((int) (Math.random()) * deck.getDeckOfCards().size());
        current.sortHand();
    }

    public String toString() {
        String contents = "";
        for (int i = 0; i < cards.length; i++) {
            contents += cards[i] + "\t\t";
        }
        return contents;
    }

}
