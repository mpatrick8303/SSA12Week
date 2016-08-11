package com.tiy.ssa.weektwo.assignmentsix;

import javax.xml.stream.events.Characters;

public class AssociativeGrammer
{
    private String orginalInput;
    private String tempString;
    
    public AssociativeGrammer(String orginalInput)
    {
        this.orginalInput = orginalInput;
        //return the 'program' source - the input that needs to be compiled
    }
    
    public String getSource()
    {
        tempString = "";
        char orgInChar[];
        char chars[] = {'{','}','[',']','(',')'};
        
        orgInChar = orginalInput.toCharArray();
        
        for(int i = 1;i < orgInChar.length;i++)
        {
            for(int j = 0; j < chars.length;j++)
            {
                if(orginalInput.substring(i, i-1).equals(chars.equals(j)))
                {
                    tempString = tempString + orginalInput.substring(i, i-1);
                } 
            }
            
          
        }
        return tempString;
        
        
        
      //param operator - one of '(', '{', '[', ')', '}', ']' - any other value is illegal
        //return the 'program'
    }
    
    public String addOperator(char operator)
    {
        for(int i = 0;i < )
        {
            if()
        }
        
      //return whether the 'program' is valid
    }
    
    public boolean compile()
    {
        
    }

}
