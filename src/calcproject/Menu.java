package calcproject;

import java.util.Scanner;

public class Menu {

	double a, b;
	byte choice;

	public void displayMenu() {
		Scanner scan = new Scanner(System.in);
		Inputs inp = new Inputs();
		System.out.println("Enter two numbers: ");
		
		a = inp.setA(scan.nextDouble());
		b = inp.setB(scan.nextDouble());
		
		System.out.println("What operation would you like to perform?");
		System.out.println("(1) Add");
		System.out.println("(2) Subtract");
		System.out.println("(3) Multiply");
		System.out.println("(4) Divide");
		System.out.println("(5) Exit");
		
		choice = inp.setChoice(scan.nextByte());		
		}
	}

