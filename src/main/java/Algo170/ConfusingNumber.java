/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo170;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Erdem
 */
public class ConfusingNumber {
    
    
    public static boolean SolutionA(int n)
    {
        boolean ret = false;
        while (n > 0) {            
            int digit = n % 10;
            if (digit == 6 || digit == 9) {
                ret = true;
            }
            else if (digit == 1 || digit == 8) { 
                //
            }
            else
            {
                return false;
            }
            n /= 10;
        }
        return  ret;
    }
    public static boolean SolutionB(int N)
    {
        //https://github.com/altayhunoglu/algorithms/blob/master/src/main/java/algorithms/curated170/easy/ConfusingNumber.java
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(6, 9);
        map.put(9, 6);
        map.put(0, 0);
        map.put(1, 1);
        map.put(8, 8); 
        int newNum = 0;
        int x = N;
        while (x != 0) {
            int remainder = x % 10;
            if (!map.containsKey(remainder)) 
                return false;
            if(newNum > Integer.MAX_VALUE/10)
                return false;
            newNum = newNum * 10 + map.get(remainder);
            x /= 10;
        }    
        return N == newNum? false: true;
    }
    
    }
