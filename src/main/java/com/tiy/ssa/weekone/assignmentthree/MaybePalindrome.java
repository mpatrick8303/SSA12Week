package com.tiy.ssa.weekone.assignmentthree;

public class MaybePalindrome
{
	final String value;

	
	
	public MaybePalindrome(String value)
	{
		this.value = value.toLowerCase();
	}
	
	public boolean isPalindrome()
	{
		
//		for(char c : chars)//advanced for loop normal way is for(int i = 0, i<chars.length;i++){chars[i]}
//		{
//			//advanced way you dont't have i just gives you the actually char
//			System.out.println(c);
//			
//		}
		String tempValue;
		
		tempValue = replaceSpace();
		
		final char[] chars =  tempValue.toCharArray();//use final because it doesn't need to be changed after this
		
		boolean palin = false;
		int j = (chars.length-1);
		
		
		for(int i = 0; i < chars.length; i++)
		{
			
			if(chars[i] == chars[j])
			{
				
				palin = true;
//				System.out.println("j" + j + chars[j]);
//				System.out.println("i" + i + chars[i]);
				j--;
				
			}
			else
			{
				palin = false;
				break;
			}
			
			
		}
		return palin;
	}
	
	private String replaceSpace()
	{
		String tempValue;
		tempValue = value.replaceAll(" ", "");
		return tempValue;
	}
	
	
	
	@Override
	public String toString()
	{
		System.out.println(this.value + (isPalindrome()  ? " is " : " isn't ") + "a palindrome");
		return this.value + (isPalindrome()  ? " is " : " isn't ") + "a palindrome" ;
	}
	
	
}
