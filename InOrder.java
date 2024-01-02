/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int number = (int) (Math.random()*10);
		int temp=0;
		while(temp<=number){
			System.out.print(number+" ");
			temp=number;
			number = (int) (Math.random()*10);
		}	
	}
}