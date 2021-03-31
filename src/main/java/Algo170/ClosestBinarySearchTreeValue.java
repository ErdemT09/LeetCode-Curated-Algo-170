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
        TreeNode left;
        TreeNode right;
        
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
        if (tn.left == null && tn.right == null) {
            return tn.val;
        }
        
        TreeNode bestNode = tn;
        boolean _continue = true;
        while (_continue) {            
            if (target > bestNode.val && bestNode.right != null) {
                if (Math.abs(target - bestNode.right.val) < Math.abs(target - bestNode.val) ) {
                    bestNode = bestNode.right;
                }
                else
                {
                    _continue = false;
                }
            }
            else if (target < bestNode.val && bestNode.left != null) {
                if (Math.abs(target - bestNode.left.val) < Math.abs(target - bestNode.val) ) {
                    bestNode = bestNode.left;
                }
                else
                {
                    _continue = false;
                }
            }
            else
            {
                _continue = false;
            }
        }
        return bestNode.val;
    }
    
    public static TreeNode SortedArrayToTreeConverter(int[] arr)
    {
        //I thought of implementing this as an easy way of generating nodes but this is actually harder, and an other LeetCode question
        //https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
        return  null;
    }
}
