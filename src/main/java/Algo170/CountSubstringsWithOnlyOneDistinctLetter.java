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
public class CountSubstringsWithOnlyOneDistinctLetter {
    public static int Solution(String S)
    {
        //https://github.com/altayhunoglu/algorithms/blob/master/src/main/java/algorithms/curated170/easy/CountSubstringswithOnlyOneDistinctLetter.java
        int total = 1, count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i-1)) {
                count++;
            } else {
                count = 1;
            }
            total += count;
        }
        return total;
    }
}
