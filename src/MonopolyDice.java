import java.util.Random;

public class MonopolyDice {
	public static void main(String[] args){
		System.out.println("Starting...");
		Random r = new Random();
		
		int die1 = 0;
		int die2 = 0;
		
		int rolls = 0;
		boolean jail = false;
		
		while(die1==die2){
			die1 = r.nextInt(6)+1;
			//die2 = r.nextInt(6)+1;
			die2 = die1;
			
			System.out.println("Rolls " + die1 + " & " + die2);
			
			rolls++;
			
			if(die1 == die2){
				System.out.println("DOUBLES");
				if(rolls == 3){
					jail = true;
					break;
				}
				System.out.println("Move " + (die1+die2) + " spaces and roll again");
			}
			else System.out.println("Move " + (die1+die2) + " spaces and end turn");
		}
		if(jail)System.out.println("GO TO JAIL ---->");
	}
}
