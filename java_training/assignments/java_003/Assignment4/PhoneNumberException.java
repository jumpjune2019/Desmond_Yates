package hm1;

import java.io.IOException;

public class PhoneNumberException extends Exception{

private static final long serialVersionUID = 1L;
	
	public void printMessage() {
		System.out.println("You entered an invalid input");

	}

}
