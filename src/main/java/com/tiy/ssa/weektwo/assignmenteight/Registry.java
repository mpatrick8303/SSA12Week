package com.tiy.ssa.weektwo.assignmenteight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Registry
{
    private Map<SocialSecurityNumber, Person>registryTree = new HashMap<>();
    
    public boolean add(Person person)
    {
       return registryTree.putIfAbsent(person.ssn, person) == null;          
           
    }
   
    
    public Person progenitor(SocialSecurityNumber ssn)
    {
        
        List<Person> possiblePregenitor = 
                ancestors(ssn).stream()
                    .filter((Person p)-> !p.hasParents())
                    .sorted((p1, p2)-> p2.age() - p1.age())
                    .limit(1)
                    .collect(Collectors.toList());
        
//        System.out.println(possiblePregenitor.get(0).name.firstN);
        return possiblePregenitor.get(0);
        
        
        
    }
    
    public List<Person> ancestors(SocialSecurityNumber ssn)
    {
        List<Person> ancestors = new ArrayList<>(registryTree.size());

        if(this.registryTree.get(ssn).parentI == null && this.registryTree.get(ssn).parentII == null)
            return ancestors;
        
        if(this.registryTree.get(ssn).parentI != null)
        {
            ancestors.add(this.registryTree.get(ssn).parentI);
        }
        if(this.registryTree.get(ssn).parentII != null)
        {
            ancestors.add(this.registryTree.get(ssn).parentII);
        } 
       
        int j =0;
        int g = 0;
        
//        for(int j = 0;ancestors.get(j).parentI == null && ancestors.get(j).parentII == null;j ++)
        
        
            
        while(g == 0 || j < ancestors.size())
        {
            //ancestors.get(j) != null &&  
            if(ancestors.get(j).parentI != null)
            {
                ancestors.add(ancestors.get(j).parentI);
            }
            //ancestors.get(j) != null && 
            if(ancestors.get(j).parentII != null)
            {
                ancestors.add(ancestors.get(j).parentII);
            }
          
            if(ancestors.get(j).parentI == null && ancestors.get(j).parentII == null)
            {
                g = 1;
            }
            
            j++;
            
            
           

        }
        
        
        
        return ancestors;
        
    }
    
    public List<Person> decendents(SocialSecurityNumber ssn)
    {
        List<Person> decendents = new ArrayList<>();

        if(this.registryTree.get(ssn).getChildren().isEmpty())
            return decendents;
        
        if(!(this.registryTree.get(ssn).getChildren().isEmpty()))
        {
            decendents.addAll(this.registryTree.get(ssn).getChildren());
        }
       
       
        
        
        for(int j = 0;!decendents.get(j).getChildren().isEmpty();j ++)
        {
            if(decendents.get(j) != null &&  !(decendents.get(j).getChildren().isEmpty()))
            {
                decendents.addAll(decendents.get(j).getChildren());
            }
          
        }
        
        return decendents;
    }
    
    public boolean areRelated(SocialSecurityNumber one, SocialSecurityNumber two)
    {
        
        List<Person> tempAncestors = ancestors(one);        
        List<Person> tempDecendents = decendents(one);
        
        if(!tempAncestors.isEmpty())
        {
            for(int i = 0; i<tempAncestors.size();i++)
            {
                if(tempAncestors.get(i).getSsn().equals(two))
                    return true;
            }
        }
        if(!tempDecendents.isEmpty())
        {
            for(int i = 0; i<tempDecendents.size();i++)
            {
                if(tempDecendents.get(i).getSsn() == two)
                return true;
            }
        }
        
        return false;
    }
    

    
    public Person get(SocialSecurityNumber ssn)
    {
        
        return this.registryTree.get(ssn);
    }
    
    public Person youngestDescendant(SocialSecurityNumber ssn)
    {
       
        if(registryTree.get(ssn).children.isEmpty())
        {
           return registryTree.get(ssn);
        }
        List<Person> sortedDecendents = 
        decendents(ssn).stream()
            .filter((Person p)-> p.isAlive())
            .sorted((p1, p2)-> p1.age() - p2.age())
            .limit(1)
            .collect(Collectors.toList());
        
//        System.out.println(sortedDecendents.get(0).name.firstN + sortedDecendents.get(0).age());


        Person p = sortedDecendents.get(0);
        
        return p;       

        
    }
    
    public Person oldestLivingRelative(SocialSecurityNumber ssn)
    {
        if(registryTree.get(ssn).parentI == null && registryTree.get(ssn).parentII == null)
        {
           return registryTree.get(ssn);
        }
        List<Person> sortedAncestors = 
        ancestors(ssn).stream()
            .filter((Person p)-> p.isAlive())
            .sorted((p1, p2)-> p2.age() - p1.age())
            .limit(1)
            .collect(Collectors.toList());
        
//        System.out.println(sortedAncestors.get(0).name.firstN + sortedAncestors.get(0).age());


        Person p = sortedAncestors.get(0);
        
        return p;
    }
    
    public int getSize()
    {
        return registryTree.size();
    }


    public static enum Relationship
    {
        PARENT, CHILD, GRANDPARENT, GRANDCHILD, COUSIN, SIBLING, NIBLING, AUNCLE;
    }
    
    
    
    
}
