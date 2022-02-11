import java.util.Scanner;
public class Poids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of kilos: ");
		double kilo = input.nextDouble();
		
		double pound = kilo * 2.204;
		System.out.println("That is "+ pound + " pounds");
	}

}
