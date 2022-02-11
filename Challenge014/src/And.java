import java.util.Scanner;
public class And {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value between 10 and 20: ");
		int num = input.nextInt();
		
		if(num >= 10 && num <=20) {
			System.out.println("Thank you");
		}
		else {
			System.out.println("Incorrect answer");
		}

	}

}
