package week1.day1;


public class SumOfDigits {
	
	public static void main(String[] args) {
		
	
	int number = 123;
	int quotient=0, sum =0;
	
	while (number!=0);{
	quotient=number/10;
	int reminder = number%10;
	sum=sum+reminder;
	number=quotient;
}
	
	    
	System.out.println("sum of digits:" + sum);

	}
}


