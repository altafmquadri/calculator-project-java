/* This projects code was collaborated on by 
 * Aibek Ozhorov
 * Altaf Quadri
 * Vivica Ma
 * */

package calcproject;
public class Calculator {

	public static void main(String[] args) {

		Menu m = new Menu();
		double result;
		System.out.println("Welcome to the calculator program!");
		
		do {
			m.displayMenu();
			
			switch (m.choice) {
			case 1:
				result = add(m.a, m.b);
				System.out.println("You asked to add two numbers:");
				System.out.println(m.a + " + " +m.b+ " = " +result);
				System.out.println();
				break;
			case 2:
				result = subtract(m.a, m.b);
				System.out.println("You asked to subtract two numbers:");
				System.out.println(m.a + " - " +m.b+ " = " +result);
				System.out.println();
				break;
			case 3:
				result = multiply(m.a, m.b);
				System.out.println("You asked to multiply two numbers:");
				System.out.println(m.a + " * " +m.b+ " = " +result);
				System.out.println();
				break;
			case 4:
				result = divide(m.a, m.b);
				System.out.println("You asked to divide two numbers:");
				System.out.println(m.a + " / " +m.b+ " = " +result);
				System.out.println();
				break;
			case 5:
				break;
			default:
				System.out.println("Please select a valid choice!");
				System.out.println();
			}
			
		} while(m.choice != 5);
		
		System.out.println("Thank you for using the calculator!");
	}

	public static double add(double a, double b) {
		return a + b;
	}
	
	private static double subtract(double a, double b) {
		return a - b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
}



