//Assignment 1:Coding Challenge

package simple;
import java.util.Scanner;
public class Simple_prgm {

	public static void main(String[] args) {
		int num1, num2, add, subtract, multiply;
	    float divide;
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    num1 = scanner.nextInt();
	    num2 = scanner.nextInt();

	    add = num1 + num2;
	    subtract = num1 - num2;
	    multiply = num1 * num2;
	    divide = (float) num1 / num2;

	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + divide);
	}

}
