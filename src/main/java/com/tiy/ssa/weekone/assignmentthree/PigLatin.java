package com.tiy.ssa.weekone.assignmentthree;


import java.util.Arrays;

public class PigLatin
{
	
	private String value;
	
	
	public PigLatin(String value)
	{
		this.value = value;
	}
	
	public String translate()
	{
		String finalSentence = "";
		String[] words = value.split("\\s+");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = words[i].replaceAll(" ", "");
			
			String finValue = "";
			String lVow = words[i];
			char vow1 = Character.toLowerCase(lVow.charAt(0));
			char vow2 = Character.toLowerCase(lVow.charAt(1));
			
			if (vow1 == 'a' || vow1 == 'e' || vow1 == 'i' || vow1 == 'o' || vow1 == 'u')
			{
				finValue = lVow + "way";
			}
			else if(vow2 == 'a' || vow2 == 'e' || vow2 == 'i' || vow2 == 'o' || vow2 == 'u')
			{
				String firstLetter = lVow.substring(0, 1);
				String lVowRemain = lVow.substring(1, lVow.length());
				finValue = lVowRemain + firstLetter + "ay";
				
			}
			else
			{
				String firstLetter = lVow.substring(0,1);
				String secondLetter = lVow.substring(1,2);
				String lVowRemain = lVow.substring(2, lVow.length());
				finValue = lVowRemain + firstLetter + secondLetter + "ay";
			}
			
			finalSentence = finalSentence + finValue;
			if(i != words.length - 1)
			{
			finalSentence = finalSentence + " ";
			}
		}
		
		System.out.println(finalSentence);
		return finalSentence;
		
		
	}
	
	
}
