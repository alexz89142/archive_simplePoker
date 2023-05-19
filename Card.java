package simplePoker;
import java.util.Random;

public class Card {
	private int suit;
	private int value;
	
	public Card(){
		this.value=new Random().nextInt(13) + 1;
		this.suit=new Random().nextInt(3)+0; 
	}
	public Card(int suit, int value){
		if(!setSuit(suit))
			this.suit=new Random().nextInt(3)+0; 
		if(!setValue(value))
			this.value=new Random().nextInt(3)+0;
	}
	public int getSuitAsInt(){
		return suit;
	}
	public int getValueAsInt(){
		return value;
	}
	public boolean setValue(int value){
		if(value>=1 && value<=13){
			this.value=value;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean setSuit(int suit){
		if(suit>=1 && suit<=4){
			this.suit=suit;
			return true;
		}
		else{
			return false;
		}
	}
	public char getSuit(){
		switch(suit){
		case 0: return 'H';
		case 1: return 'S';
		case 2: return 'D';
		case 3: return 'C';
		default: return 'H';
		}
	}
	public String getValue(){
		if(value>=2 && value<=10){
			return Integer.toString(value);
		}
		else{
			switch(value){
			case 1: return "A";
			case 11: return "J";
			case 12: return "Q";
			case 13: return "K";
			default: return "J";
			}
		}
	}
	public String toString(){
		return getValue()+getSuit();
	}
	public boolean equalsSuit(Card other){
		if(this.suit==other.suit)
			return true;
		else
			return false;
	}



}


