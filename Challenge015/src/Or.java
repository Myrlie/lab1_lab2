import java.util.Scanner;
public class Or {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type in your favourite colour: ");
		String colour = input.nextLine();
		
		if(colour.equals("red")  || colour.equals("RED")  || colour.equals("Red") ) {
			System.out.println("I like red too.");
		}
		else {
			System.out.println("I don't like that colour, I prefer red");
		}

	}

}
