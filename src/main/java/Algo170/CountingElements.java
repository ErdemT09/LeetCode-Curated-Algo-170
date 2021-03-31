/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo170;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Erdem
 */
public class CountingElements {
    
 public static int Solution(int [] arr)
 {
     //My initial approach
     List<Integer> allowedNums = new LinkedList<>();
     List<Integer> NumsToCheck = new LinkedList<>();
     int count = 0;
     for(int n : arr)
     {
         if (allowedNums.contains(n)) {
             count++;
         }
         else
         {
             NumsToCheck.add(n+1);
         }
         count += Collections.frequency(NumsToCheck, n);
         for (int i = 0; NumsToCheck.contains(n) && i<NumsToCheck.size(); i++) {
             if (NumsToCheck.get(i) == n) {
                 NumsToCheck.remove(i);
                 i--;
             }
         }
         allowedNums.add(n-1);
     }
     return count;
 }
}
