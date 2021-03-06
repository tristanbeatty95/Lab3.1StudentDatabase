import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] studentNames = {"Dylan", "Toby", "Sara", "Shelby", "Chelsea"};
		String[] favFood = {"Pizza", "Curry", "Enchiladas", "Cashews", "Tiramisu"};
		String[] homeTown = {"Phoenix", "Toronto", "San Fransisco", "Detroit", "London"};
		
		
		
		System.out.println("Welcome to our java class. Which student would you like to learn more about? (enter a number 1-5)");
		try {
		int userInput = scan.nextInt();
		scan.nextLine();

		
		System.out.println("Student "+userInput+" is "+studentNames[userInput - 1] +
				". What would you like to know about "+studentNames[userInput - 1] +
				"? (enter \"hometown\" or \"favorite food\")");
		
		
		String userInput2 = scan.nextLine();
		
		if(userInput2.equals("hometown")) {
			System.out.println(studentNames[userInput - 1] + " is from " + homeTown[userInput - 1]
					+ ". Would you like to know more? (enter \"yes\" or \"no\")");
		} else if(userInput2.equals("favorite food")) {
			System.out.println(studentNames[userInput - 1] + "'s favorite food is "
					+ favFood[userInput - 1] + ". Would you like to know more? (enter \"yes\" or \"no\")");
		}
		
		String userInput3 = scan.nextLine();
		
		if(userInput3.equals("yes") && userInput2.equals("hometown")) {
			System.out.println(studentNames[userInput - 1] + "'s favorite food is "
					+ favFood[userInput - 1] + ".");
		} else if(userInput3.equals("yes") && userInput2.equals("favorite food")) {
			System.out.println(studentNames[userInput - 1] + " is from " + homeTown[userInput - 1]
					+ ".");
		}
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("That wasn't a valid number. Please try again.");
			scan.nextInt();
			scan.nextLine();
		}catch(InputMismatchException ex) {
			System.out.println("Please enter a number. (1 - 5)");
			scan.nextInt();
			scan.nextLine();
		}
	}
	
}
