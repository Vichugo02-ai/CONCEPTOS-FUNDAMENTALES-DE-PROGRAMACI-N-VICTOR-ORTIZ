package co.edu.poli.ProblemasPropuestosEscenario1;
import java.util.Scanner;

public class EvenOddOperation {
//Program that determines if a number is even or odd without conditionals
	public static void main(String[] args) {
		/* We create the Scanner object to read the 
		 * input of the integer type if it is even or odd
		 */
		Scanner sn = new Scanner(System.in);
		System.out.print("Type a int value: ");
		// Reading integer 
		int num = sn.nextInt();
		
		// Array where [0] = "even", [1] = "odd"
		String[] result = {"even", "odd"};
		
		// We use the modulo % 2 as an index
		System.out.println("The int we just read is: " + result[num % 2]);
		
		sn.close(); //close the Scanner
	}

}
