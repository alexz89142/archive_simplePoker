package simplePoker;

public class PokerDriver {

	public static void main(String[] args) {
		Player[] players={new Player(),new Player()};
		
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


