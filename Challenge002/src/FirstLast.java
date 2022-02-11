import java.util.Scanner;
public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your firstname ");
		String firstname = input.nextLine();
		System.out.println("Enter your lastname ");
		String lastname = input.nextLine();
		System.out.println("Your fullname is " + firstname + " " + lastname);
	}

}
