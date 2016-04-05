package atm.input;

import java.util.Scanner;

public class TextAtmInput implements AtmInput {

	private int userInputNumber;

	public void input() {
		Scanner inputScaner = new Scanner(System.in);
		userInputNumber = inputScaner.nextInt();
		System.out.println("입력값은 : " + userInputNumber);
	}

	public int getUserInputNumber() {
		return userInputNumber;
	}

}
