package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest
{

	@Test
	public void test()
	{
		assertEquals("igpay", new PigLatin("pig").translate());
		assertEquals("atinlay", new PigLatin("latin").translate());
		assertEquals("isway", new PigLatin("is").translate());
		assertEquals("ardhay", new PigLatin("hard").translate());
		assertEquals("otay", new PigLatin("to").translate());
		assertEquals("eakspay", new PigLatin("speak").translate());
		assertEquals("elphay emay otay ethay", new PigLatin("help me to the").translate());
		
		
	
	}

}
