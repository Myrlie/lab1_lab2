import java.util.Scanner;
public class Correct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		if(num < 10 ) {
			System.out.println("Too low");
			}
		else{
			if(num >= 10 && num<=20) {
				System.out.print("Correct");
				}
			else {
					System.out.println("Too high");
					}

			}

	}

}
