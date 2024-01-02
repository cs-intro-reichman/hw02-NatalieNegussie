/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double average; 
		int girlCounter=0, boyCounter=0, total=0, sum=0;
		int twokids=0,threekids=0,fourkids=0;
		int n = Integer.parseInt(args[0]);
		for(int i=0; i<n; i++){
		while((girlCounter<1)||(boyCounter<1)){
			int gender=(int)(Math.random()*10);
			if(gender <=4){
				girlCounter++;
			}	
			else{
				boyCounter++;
			}
			total++;
		}
			sum = sum+total;
			
			if(total == 2){
				twokids++;
			}
			else if(total == 3){
				threekids++;
			}
			else{
				fourkids++;
			}
			
			total = 0;
			girlCounter = 0;
			boyCounter = 0;
			
		}
		average= (double)sum/(double)n;
		System.out.println("Average: " +average+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " +twokids);
		System.out.println("Number of families with 3 children: " +threekids);
		System.out.println("Number of families with 4 or more children: " +fourkids);
		if((twokids>threekids)&&(twokids>=fourkids)){
			System.out.println("The most common number of children is 2.");
		}
		else if((threekids>=twokids)&&(threekids>fourkids)){
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4 or more.");
		}
			
	}
}