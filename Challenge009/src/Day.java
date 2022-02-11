import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of days: ");
		int days = input.nextInt();
		
		int hours = days*24;
		int minutes = hours*60;
		int seconds = minutes*60;
		
		System.out.println("In "+ days + " days there are...");
		System.out.println(hours + " hours");
		System.out.println(minutes + " minutes");
		System.out.println(seconds + " seconds");
	}

}
