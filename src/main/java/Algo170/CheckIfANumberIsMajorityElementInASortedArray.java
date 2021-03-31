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
public class CheckIfANumberIsMajorityElementInASortedArray {
    public static boolean Solution(int n, int [] N)
    {
        int length = N.length;
        int firstIndex = FirstOccur(n, N, length);
        int minimumLastIndex = firstIndex + length/2;
        if(length > minimumLastIndex && N[minimumLastIndex] == n)
        {
            return true;
        }
                return false;
    }
    public static int FirstOccur(int n, int [] N, int length)
    {
        
        int lo = 0;
        int hi = length;
        while (lo < hi) {            
            int mid = lo + (hi-lo)/2;
            if (N[mid] < n) 
            {
                lo = mid + 1;
            }
            else if (N[mid] >= n)
            {
                hi = mid;
            }
        }
        return  lo; 
        
    }
}
