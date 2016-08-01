package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class FooTests
{

	@Test
	public void test()
	{
		assertEquals(5, new Foo().HelloClass());//calling that method and looking for a 5
	}
	
	//main/java and main/test are just parallel structures 
	//test must be in same or parallel structure as the method it is checking
	//write a test for every method

}
