package week1.day1.assignments;

public class PrimeNumber {

	
	public static void main(String[] args) {

		
		int a = 13, i;
		boolean flag = false;
		
		for(i=2; i<a/2;i++) {
			
			
			if(i%2 == 0)
			{
				System.out.println("It is not a prime");
				flag = true;
				break;
				
			}
			
			if(!flag) {
				System.out.println("It is a prime");
			}
			else {
				System.out.println("It is prime");
			}
			
			
		}


		// Declare an int Input and assign a value 13

		

		// Declare a boolean variable flag as false

		

		// Iterate from 2 to half of the input

		

			// Divide the input with each for loop variable and check the remainder

			

			// Set the flag as true when there is no remainder

				
			// break the iterator


		// Check the flag (Provide a condition)

		

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 

   }

}