package week1.day1.assignments;

public class FibonacciSeries {

	
	
	

	public static void main(String[] args) {
		
		int a=0, b=1, c,i, count = 8; 
		System.out.println(a);
		
		for(i=1;i<=count;i++)
		{
	     c =  a + b;
		 System.out.println(c);
		 a = b;
		 b = c;
			
			
		}
		

		
	}

}