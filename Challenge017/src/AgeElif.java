import java.util.Scanner;
public class AgeElif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?: ");
		int age = input.nextInt();
		
		if(age == 18 ) {
			System.out.println("You can vote");
			}
		else{
			if(age == 17) {
				System.out.print("You can learn to drive");
				}
			else {
				if(age==16) {
					System.out.println("You can buy a lottery ticket");
					}
				
				else {
			System.out.println("You can go Trick-or-Treating");
					}

				}

			}
}
}