import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice = 1;

		while (true) {

			System.out.println("Welcome to Lucky Number CashBack");

			int[] cashBacks = { 20, 200, 320, 500, 50, 80, 90, 1000 };
			int Lucky_Number = 0;

			System.out.println("Enter Your Lucky Number");

			try {

				Lucky_Number = scanner.nextInt();

			} catch (Exception e) {
				System.out.println("Sorry!! Input MisMatched");
			}

			

			System.out.println(
					"For Your Lucky Number " + Lucky_Number + " CashBack Earned is: " + cashBacks[Lucky_Number]);

			System.out.println("Enter 0 to quit");

			choice = scanner.nextInt();

			if (choice == 0) {

				break;

			}

		}

		scanner.close();

		System.out.println("Thank you For Playing Lucky Number CashBack");

	}

}
