/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo170;

/**
 *
 * @author Erdem
 */
public class ArmstrongNumber {
    
    public static boolean Solution(int a)
    {
        int length  = String.valueOf(a).length();
        int sum = 0;
        int n = a;
               while(n != 0) {
           // Modulo 10 gives us the last digit
           // Add digit ^ k to the result
           sum += Math.pow(n % 10, length);
            // Remove the last digit.
           n = n / 10;
       }
               return a == sum;
    }
}
