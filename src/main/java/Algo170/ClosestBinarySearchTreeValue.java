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
public class ClosestBinarySearchTreeValue {
    public static class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        
        public TreeNode(int v) {
            val = v;
        }
        public TreeNode(int v, TreeNode l, TreeNode r) {
            val = v;
            left = l;
            right = r;
        }
        
    }
 
    public static int Solution(float target, TreeNode tn)
    {
        int currentBest = tn.val;
        if(tn.left != null && target < currentBest)
        {
            currentBest = SolutionHelper(target, currentBest, tn.left);
        }
        else if(tn.right != null && target > currentBest)
        {
            currentBest = SolutionHelper(target, currentBest, tn.right);
        }
        return currentBest;
    }
    public static int SolutionHelper(float target, int currentBest, TreeNode tn)
    {
        if (Math.abs(target - tn.val) < Math.abs(currentBest - target)) {
            currentBest = tn.val;
        }
              if(tn.left != null && target < tn.val)
        {
            currentBest = SolutionHelper(target, currentBest, tn.left);
        }
        else if(tn.right != null && target > tn.val)
        {
            currentBest = SolutionHelper(target, currentBest, tn.right);
        }
              
              return currentBest;
    }
    
    public static TreeNode SortedArrayToTreeConverter(int[] arr)
    {
        //I thought of implementing this as an easy way of generating nodes but this is actually harder, and an other LeetCode question
        //https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
        return  null;
    }
}
