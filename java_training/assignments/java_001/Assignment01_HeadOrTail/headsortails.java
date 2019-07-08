public class headsortails {

	public static void dice(){
		int i;
		int min = 1;
		int max = 2;
		int dice = (min+max)+1;
		for(i=0; i<=dice; i++) {
		dice = (int)(Math.random()*max)+min;
		}
		if(dice==1) {
			System.out.println("Coin Flip Program" + "\n" + "The coin flip is heads!!");
		} 
		else {
			System.out.println("Coin Flip Program" + "\n" + "The coin flip is tails!!");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		headsortails.dice();
	}

}
