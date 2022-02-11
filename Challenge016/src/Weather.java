import java.util.Scanner;
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Is it raining?: ");
		String raining = input.nextLine();
		raining = raining.toLowerCase();
		
		if(raining.equals("yes") ) {
			System.out.println("Is it windy?: ");
			String windy = input.nextLine();
			windy = windy.toLowerCase();
			if(windy.equals("yes")) {
				System.out.print("It is too windy for an umbrella");
			}
			else {
				System.out.println("Take an umberella");
			}
		}
		else {
			System.out.println("Enjoy your day");
		}

	}

}
