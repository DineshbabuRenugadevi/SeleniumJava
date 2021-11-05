package week1.day1;

public class LearnTRIZZ {

	public static void main(String[] args) {
		int number = 20;
		if(number % 3 ==0 && number % 5 ==0) {
			System.out.println("Divisible by both 3&5");
		}else if(number % 5 ==0) {
			System.out.println("Divisible by 5");
		}else if (number % 3 ==0) {
			System.out.println("Divisible by 3");
		}else {
			System.out.println("neither divisible by 3 & 5");
		}

	}

}
