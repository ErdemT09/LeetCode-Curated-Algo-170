/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo170;

import java.util.HashMap;

/**
 *
 * @author Erdem
 */
public class ConfusingNumber {
    
    
    public static boolean Solution(int n)
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
}
