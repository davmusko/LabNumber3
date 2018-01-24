import java.util.Scanner;

public class MathPowers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNum;
		int squared;
		int cubed;
		String redoProgram;
		
		
		System.out.println("Learn your squares and cubes!");
		do {
		System.out.print("Enter an integer: ");
		userNum = input.nextInt();
		input.nextLine();
		
		System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
		System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "=======");
		
			for (int i = 1; i <= userNum; i++) {		
				squared = (int) Math.pow(i, 2);
				cubed = (int) Math.pow(i, 3);
				System.out.printf("%-10s %-10s %-10s\n", i, squared, cubed);
			}
		
		System.out.println("Continue? (y/n): ");
		redoProgram = input.nextLine();
		} while (redoProgram.equalsIgnoreCase("y"));
	System.out.println("Thanks for learning!");
	}
	
}
