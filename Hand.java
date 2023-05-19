package simplePoker;

public class Hand {
	private Card[] cards;
	
	public Hand(int size){
		cards=new Card[size];
	}
	public Hand(){//Defaults with 5 random cards instead of empty
		cards=new Card[1];
	}
	
	public int getSize(){
		return cards.length;
	}
	
	public Card getCard(int x){
		return cards[x];
	}  
	public boolean setCard(int x, Card card){
		if(card.getValueAsInt()<14 && card.getSuitAsInt()<4){
			cards[x]=card;
			return true;
		}
		else
			return false;
			
	}
	public String toString(){
		String temp="";
		
		for(int x=0;x<cards.length;x++){
			temp=temp+cards[x].toString();
			
			if(x<cards.length-1)
				temp=temp+", ";
		}
		return temp;
	}

}


