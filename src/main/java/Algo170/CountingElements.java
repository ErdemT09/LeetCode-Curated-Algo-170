/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo170;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Erdem
 */
public class CountingElements {
    public static int SolutionA(int [] arr)
    {
        //https://github.com/altayhunoglu/algorithms/blob/master/src/main/java/algorithms/curated170/easy/CountingElements.java
          Arrays.sort(arr); //Time complexity: O(n log n)
    int count = 0;
    int runLength = 1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] != arr[i]) {
            if (arr[i - 1] + 1 == arr[i]) {
                count += runLength;
            }
            runLength = 0;
        }
        runLength++;
    }
    return count;
    }
 public static int SolutionB(int [] arr)
 {
     //My initial approach
     
     //Worst case time complexity is probably O(n log n) (SolutionA) < O(this) < O(n^2)
     
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
