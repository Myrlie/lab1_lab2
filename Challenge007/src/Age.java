import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = input.nextLine();
		
		System.out.println("How old are you? ");
		int age = input.nextInt();
		
		int newAge = age + 1;
		
		System.out.println(name+ " next birthday you will be "+ newAge);

	}

}
