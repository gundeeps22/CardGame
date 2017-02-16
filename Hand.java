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
public class Hand {

    private Card[] cards;
    
    public Hand(Card[] cards){
        this.cards = cards;
        this.sortHand();
    }

    public void sortHand() {
        Card.insertionSort(cards, 5);
    }
    public String toString(){
        String contents = "";
        for (int i = 0; i < cards.length; i ++){
            contents += cards[i] + "\t\t";
        }
        return contents;
    }
}
