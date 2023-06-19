import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");

		float firstNumber = sc.nextInt();

		System.out.print("Enter second number: ");

		float secondNumber = sc.nextInt();
		System.out.print("Enter operator: ");
		String operation = sc.next();

		float result = 0;

		switch(operation){
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/": 
				result = firstNumber / secondNumber;
				break;
			case "%":
				result = firstNumber % secondNumber;
				break;
			default:
				System.out.print("Invalid option");
		}

		System.out.print("Answer is: " + result);

	}
}