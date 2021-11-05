package week1.day1;

public class LearnReturn {
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			if (i==3) {
				return;
			}
			System.out.println("return :" + i);
			
		}
	}

}
