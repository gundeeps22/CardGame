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
import java.util.ArrayList;

public class Deck {

    private int randomIndex;
    private int randomIndex2;
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public Deck() {
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= 13; k++) {
                deckOfCards.add(new Card(k, j));
            }
        }
    }

    public void shuffle() {
        for (int j = 0; j < deckOfCards.size(); j++) {
            randomIndex = (int) (Math.random() * deckOfCards.size());
            randomIndex2 = (int) (Math.random() * deckOfCards.size());
            Card temp = new Card();
            temp = deckOfCards.get(randomIndex);
            deckOfCards.set(randomIndex, deckOfCards.get(randomIndex2));
            deckOfCards.set(randomIndex2, temp);
        }
    }

    public Card[] deal() {
        Card[] cards = new Card[5];
        for (int i = 0; i < 5; i++) {
            randomIndex = (int) (Math.random() * deckOfCards.size());
            cards[i] = deckOfCards.remove(randomIndex);
        }
        return cards;
    }

    public String toString() {
        String contents = "";
        for (int i = 0; i < deckOfCards.size(); i++) {
            contents += deckOfCards.get(i) + "\t\t";
        }
        return contents;
    }
    
    public ArrayList<Card> getDeckOfCards(){
        return deckOfCards;
    }
}
