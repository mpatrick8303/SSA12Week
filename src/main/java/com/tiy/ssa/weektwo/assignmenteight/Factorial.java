package com.tiy.ssa.weektwo.assignmenteight;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial
{

    static final Map<Integer, BigInteger> facMapCache = new HashMap<>();

    private Factorial()
    {

    }

    public static BigInteger factorial(int num)
    {
            
        facMapCache.put(0, BigInteger.valueOf(1));

        int result = 0;
        if (!(facMapCache.containsKey(num)))
        {

            for (int i = num; i > 0; i--)
            {
                if (i == num)
                    result = i;
                else
                    result *= i;
            }

            BigInteger bigIntegerResult = BigInteger.valueOf(result);

            facMapCache.put(num, bigIntegerResult);
            return bigIntegerResult;
        }
        else
            return facMapCache.get(num);
        

    }

}
