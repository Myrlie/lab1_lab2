import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1, 2 or 3: ");
		String num = input.nextLine();
		
		if(num.equals("1") ) {
			System.out.println("Thank you");
			}
		else{
			if(num.equals("2")) {
				System.out.print("Well done");
				}
			else {
				if(num.equals("3")) {
					System.out.println("Correct");
					}
				
				else {
			System.out.println("Error message");
					}

				}

			}

	}

}
