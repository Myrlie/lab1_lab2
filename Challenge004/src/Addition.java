import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int number1 = input.nextInt();
		System.out.println("Enter the second number ");
		int number2 = input.nextInt();
		int answer = number1 + number2;
		System.out.println("The result is " + answer);
	}

}
