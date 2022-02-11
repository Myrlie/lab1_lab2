import java.util.Scanner;
public class Slices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of slices of pizza you started with: ");
		int startNum = input.nextInt();
		
		System.out.println("How many slices have you eaten? ");
		int endNum = input.nextInt();
		
		int slicesLeft = startNum - endNum;
		
		System.out.print("You have "+ slicesLeft+ " slices remaining.");
	}

}
