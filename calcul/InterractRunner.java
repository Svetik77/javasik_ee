package calcul;

import java.util.Scanner;

class Calculator {

	private int result;

	public void add(int... parameters) {
		for (Integer param : parameters) {
			this.setResult(this.getResult() + param);
		}
	}

	public void cleanResult() {
		this.result = 0;
	}


	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}

public class InterractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		try {
			Calculator cal = new Calculator();
			String exit = "no";
			while (!exit.equalsIgnoreCase("yes")) {
				System.out.println("Enter first arg: ");
				String first = reader.next();
				System.out.println("Enter second arg: ");
				String second = reader.next();
				cal.add(Integer.valueOf(first), Integer.valueOf(second));
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