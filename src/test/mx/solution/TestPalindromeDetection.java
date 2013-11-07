package test.mx.solution;

import static org.junit.Assert.*;
import mx.solution.PalindromeDetection;

import org.junit.Before;
import org.junit.Test;

public class TestPalindromeDetection {
	PalindromeDetection palindromeDetection ;
	@Before
	public void setUp() throws Exception {
		palindromeDetection = new PalindromeDetection();
	}

	@Test
	public void testSimplePalindrome() {
		
		
		String text="pop";
		boolean isAPalindrome = palindromeDetection.isValidPalindrome(text);
		
		assertTrue(isAPalindrome);
		
	}
	
	@Test
	public void testSimplePalindromeWihtNonAlphaNumericals() {
		
		
		String text="Ah, Satan sees Natasha";
		boolean isAPalindrome = palindromeDetection.isValidPalindrome(text);
		
		assertTrue(isAPalindrome);
		
	}

}
