/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;

/**
 *
 * @author Ethan Ta
 */
public class Card implements Comparable {

    private final int ACE = 1;
    private final int TWO = 2;
    private final int THREE = 3;
    private final int FOUR = 4;
    private final int FIVE = 5;
    private final int SIX = 6;
    private final int SEVEN = 7;
    private final int EIGHT = 8;
    private final int NINE = 9;
    private final int TEN = 10;
    private final int JACK = 11;
    private final int QUEEN = 12;
    private final int KING = 13;

    private final int CLUBS = 1;
    private final int DIAMONDS = 2;
    private final int HEARTS = 3;
    private final int SPADES = 4;

    private int value;
    private String faceName;
    private int suitValue;
    private String suit;

    public Card() {
        value = (int) (Math.random() * 13 + 1);
        setFaceName();
        suitValue = (int) (Math.random() * 4 + 1);
        setSuitName();
    }

    public Card(int v, int s) {
        value = v;
        setFaceName();
        suitValue = s;
        setSuitName();
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return (faceName + " of " + suit);
    }

    private void setFaceName() {
        switch (value) {
            case ACE:
                faceName = "Ace";
                break;
            case TWO:
                faceName = "Two";
                break;
            case THREE:
                faceName = "Three";
                break;
            case FOUR:
                faceName = "Four";
                break;
            case FIVE:
                faceName = "Five";
                break;
            case SIX:
                faceName = "Six";
                break;
            case SEVEN:
                faceName = "Seven";
                break;
            case EIGHT:
                faceName = "Eight";
                break;
            case NINE:
                faceName = "Nine";
                break;
            case TEN:
                faceName = "Ten";
                break;
            case JACK:
                faceName = "Jack";
                break;
            case QUEEN:
                faceName = "Queen";
                break;

            default:
                faceName = "King";
                break;

        }
    }

    private void setSuitName() {
        if (suitValue == CLUBS) {
            suit = "Clubs";
        } else if (suitValue == DIAMONDS) {
            suit = "Diamonds";
        } else if (suitValue == HEARTS) {
            suit = "Hearts";
        } else {
            suit = "Spades";
        }
    }

    public int compareTo(Object obj) {
        Card card1 = (Card) obj;
        if (card1.getValue() < (value)) {
            return 1;
        }
        if (card1.getValue() == (value)) {
            return 0;
        }
        return -1;

    }

    public static void insertionSort(Comparable[] objects, int size) {
        for (int index = 1; index < size; index++) {
            Comparable key = objects[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && objects[position - 1].compareTo(key) > 0) {
                objects[position] = objects[position - 1];
                position--;
            }

            objects[position] = key;
        }
    }

}
