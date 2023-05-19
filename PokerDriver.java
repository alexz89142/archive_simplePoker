package simplePoker;

public class PokerDriver {

	public static void main(String[] args) {
		Player[] players={new Player(5,500.00),new Player(5,500.00)};
		for(int x=0;x<players[0].getHand().getSize();x++){
			players[0].getHand().setCard(x,new Card());
			players[1].getHand().setCard(x,new Card());
		}
		
		System.out.println("Player 1: "+players[0].toString());
		System.out.println("Player 2: "+players[1].toString());
		
		if(players[0].compareTo(players[1])>0)
			System.out.println("Player 1 wins");
		else if(players[0].compareTo(players[1])<0)
			System.out.println("Player 2 wins");
		else
			System.out.print("Tie");

	}

}


