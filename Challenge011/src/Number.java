import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number over 100: ");
		double larger = input.nextDouble();
		
		System.out.println("Enter a number under 10: ");
		double smaller = input.nextDouble();
		
		double answer = larger / smaller;
		
		int answer2 = (int) answer;
		
		
		System.out.println(smaller+ "goes into " + larger+ " " + answer2 + " times");
		

	}

}
