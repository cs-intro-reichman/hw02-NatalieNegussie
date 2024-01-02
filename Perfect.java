/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int sum=0, count1=0, count2=0;
		int number= Integer.parseInt(args[0]);
		if(number==0){
			System.out.print(number+ " is a perfect number since " +number+ " = 0");
		}
		else{	
		for(int i=1; i<number;i++){
			if (number%i==0){
				sum += i;
				count1++;
			}	
		}
		if(sum == number){
			System.out.print(number+ " is a perfect number since " +number+ " = ");
			for(int j=1; j<number;j++){
			    count2++;
			if (number%j==0){
				System.out.print(j);
				if(count1==count2)
					System.out.print("");
				else
					System.out.print(" + ");
			}
			}	
		}	
		else
			System.out.println(number+" is not a perfect number");
		}
	}
}