package week1.day1.assignments;

/*Problem statement: Check if the number is positive or negative
---------------------------------------------------------------
Pseudocode:
----------
 1. Initialize a number, say, int number= 35;
 2. If a number is positive, print "The number is positive"
    If a number is negative, print "The number is negative"
    If it nether negative nor positive, print as "The number is neither positive nor negative"*/


public class NumberIden {
	
	public static void main(String args[]) {
	
	
	int a = 35;
	
	if(a>0) {
		
		System.out.println("Positivenumber");
	}
	else if(a<0){
		
		System.out.println("Negativenumber");
	}

	else {
		System.out.println("Neither negative nor positive");
	}
}
}
