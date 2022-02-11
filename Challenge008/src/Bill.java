import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the total cost of the bill? ");
		double bill = input.nextDouble();
		
		System.out.println("How many people are there? ");
		int people = input.nextInt();
		
		double each = bill/people;
		
		System.out.println("Each person should pay $ "+ each);
	}

}
