package calcul;

import java.util.Scanner;

public class InterractRunner {
	Calculatorik cal = new Calculatorik();

	public static void main(String[] args) {
		new InterractRunner().runCalc();
	}

	public void choice(int aa) {

	}

	public void runCalc() {
		String ch = "";
		Scanner reader = new Scanner(System.in);

		try {

			String exit = "no";
			while (!exit.equalsIgnoreCase("yes")) {
				System.out.println("Enter first number: ");
				String first = reader.next();
				System.out.println("+ , - , /, *  ");
				String znak = reader.next();
				System.out.println("Enter second number: ");
				String second = reader.next();

				switch (znak) {
				case "+":
					cal.add(Integer.valueOf(first), Integer.valueOf(second));
					break;
				case "-":
					cal.minus(Integer.valueOf(first), Integer.valueOf(second));
					break;
				case "/":
					cal.div(Integer.valueOf(first), Integer.valueOf(second));
					break;
				case "*":
					cal.mult(Integer.valueOf(first), Integer.valueOf(second));
					break;

				default:
					break;
				}

				System.out.println("result: " + cal.getResult());
				cal.cleanResult();
				System.out.println("Exit yes or no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}

}