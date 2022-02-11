import java.util.Scanner;
public class Less {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value less than 20: ");
		int num = input.nextInt();
		
		if(num >= 20) {
			System.out.println("Too high");
		}
		else {
			System.out.println("Thank you");
		}
	}

}
