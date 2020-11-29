package calcproject;

import java.util.Scanner;

public class Menu {

	double a, b;
	byte choice;

	public void displayMenu() {
		Scanner scan = new Scanner(System.in);
		Inputs inp = new Inputs();

		System.out.println();
		System.out.println("What operation would you like to perform?");
		System.out.println("(1) Add");
		System.out.println("(2) Subtract");
		System.out.println("(3) Multiply");
		System.out.println("(4) Divide");
		System.out.println("(5) Exit");
		System.out.println("Please choose from the above selection: ");

		choice = inp.setChoice(scan.nextByte());

		if (choice != 5 && (choice == 1 || choice == 2 || choice == 3 || choice == 4)) {
			System.out.println("Enter your first number: ");
			a = inp.setA(scan.nextDouble());
			System.out.println("Enter the second number: ");
			b = inp.setB(scan.nextDouble());

		}

	}
}
