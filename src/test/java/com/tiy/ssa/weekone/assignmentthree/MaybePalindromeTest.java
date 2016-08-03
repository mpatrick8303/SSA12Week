package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTest
{

	@Test
	public void test()
	{
		MaybePalindrome mP = new MaybePalindrome("racecar");
		assertTrue(mP.isPalindrome());
		assertTrue(mP.toString().compareTo("racecar is a palindrome") == 0);
		
		MaybePalindrome mP2 = new MaybePalindrome("michael");
		assertFalse(mP2.isPalindrome());
		assertTrue(mP2.toString().compareTo("michael isn't a palindrome") == 0);
		
		MaybePalindrome mP3 = new MaybePalindrome("michaelm");
		assertFalse(mP3.isPalindrome());
		assertTrue(mP3.toString().compareTo("michaelm isn't a palindrome") == 0);
		
		MaybePalindrome mP4 = new MaybePalindrome("a santa lived as a devil at nasa");
		assertTrue(mP4.isPalindrome());
		assertTrue(mP4.toString().compareTo("a santa lived as a devil at nasa is a palindrome") == 0);
		
	}
	


}
