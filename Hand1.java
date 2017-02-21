package cardGame;

public class Hand1 {
	private Card1[] cards;
	private Card1[] tempcards;
	Deck1 deck2 = new Deck1 ();
	public Hand1(Card1[] cards){
		this.cards = cards;
		this.sortHand();
	}

	public void sortHand() {
		Card1.insertionSort(cards, 5);
	}
	public void discardAndDraw (String choice, int index, Object obj){
		if (choice.equalsIgnoreCase("yes")){
			//discards
			Deck1 deck2 = (Deck1) obj;
			deck2.deckOfCards.add(cards[index]);
			cards [index] = null;
			Card1.insertionSort(cards, 5);
			tempcards = new Card1 [4];
			tempcards = cards;
			//draws


		}else{
			System.out.println();
		}
	}
	@Override
	public String toString(){
		String contents = "";
		for (int i = 0; i < cards.length; i ++){
			contents += cards[i] + "\t\t";
		}
		return contents;
	}
}
