/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String newStr = "";
		char temp;
		int strLength = str.length();
		int middle;
		if(strLength%2==1)
			middle = strLength/2;
		else
			middle = strLength/2;
		char tav = str.charAt(middle);
		for(int i=strLength-1; i>=0; i--){
		    newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);
		System.out.println("The middle character is "+ tav);	
	}
}