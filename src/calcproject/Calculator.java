/* This projects code was collaborated on by 
 * Aibek Ozhorov
 * Altaf Quadri
 * Vivica Ma
 * */

package calcproject;
public class Calculator {

	public static void main(String[] args) {

		Menu m = new Menu();
		
		do {
			m.displayMenu();
			
			switch (m.choice) {
			case 1:
				System.out.println(add(m.a, m.b));
				break;
			case 2:
				System.out.println(subtract(m.a, m.b));
				break;
			case 3:
				System.out.println(multiply(m.a, m.b));
				break;
			case 4:
				System.out.println(divide(m.a, m.b));
				break;
			default:
				System.out.println("Please select a valid choice!");
			}
			
		} while(m.choice != 5);
		
		
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



