package week1.day1.assignments;


/*Problem statement: Convert a negative number to positive number
---------------------------------------------------------------
Pseudocode:
-----------
1. Initialize an integer with a negative number
   like, int number = -40;
2. Check if the number is a negative number 
   Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive numer

4. Print as below
        "The number -40 is converted to 40"*/

public class NumberConversion {
	
	public static void main(String args[]) {
		
		int negative = -40;
	
		if(negative<0) {
			System.out.println("Negative Number");
		}
		else
		{
		   System.out.println("Positive Number");	
		}
		
		int positive =  (negative*-1);
		System.out.println(positive);
		
	
	}

}
