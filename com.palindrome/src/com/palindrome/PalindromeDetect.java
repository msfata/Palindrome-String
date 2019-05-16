package com.palindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author msfata ProgrammingHelp 16/05/2019
 */
public class PalindromeDetect {
	public static boolean detect(String input) {
		/*
		 * removes white spaces
		 */
		input = input.replaceAll("\\s+", "");
		/*
		 * 1-disable case sensitivity 2-make input mutable 3-reverse it 4-to string make
		 * it immutable
		 */
		return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
	}

	/*
	 * test it
	 */
	@Test
	void PalindromeDetectTest() {
		assertEquals(true, detect("Mom"));
	}
}
