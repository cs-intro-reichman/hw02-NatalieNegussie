
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int girlCounter=0, boyCounter=0, total=0;
		while((girlCounter<1)||(boyCounter<1)){
			int gender=(int)(Math.random()*10);
			if(gender <=4){
				girlCounter++;
				System.out.print("g ");
			}	
			else{
				boyCounter++;
				System.out.print("b ");
			}
			total++;
		}
		System.out.println();
		System.out.println("You made it... and you now have "+ total+" children.");
	}
}