package simplePoker;

public class Player {
	private int score;
	private double money;
	private Hand hand;
	
	public  Player(int size, double amt){
		hand=new Hand(size);
		money=amt;
	}
	public Player(){ //default
		hand=new Hand();
		money=500.00;
	}
	public void scoreHand(){
		int[] scores={0,0,0,0};
		
		for(int x=0;x<hand.getSize();x++)
			scores[hand.getCard(x).getSuitAsInt()]+=hand.getCard(x).getValueAsInt();
		
		score= Math.max(Math.max(scores[0],scores[1]),Math.max(scores[2],scores[3]));
	}
	public int getScore(){
		scoreHand();
		return score;
	}
	public Hand getHand(){
		return hand;
	}
	public String toString(){
		return hand.toString() +" - Score: "+getScore();
	}
	public int compareTo(Player other){
		return this.getScore()-other.getScore();
	}
	

}


