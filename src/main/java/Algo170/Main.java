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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem1474.ListNode head =  Problem1474.ArrayToListNode(new int[] {1,2,3,4,5,6,7,8,9, 10, 11, 12, 13, 14, 15, 16});
        
        
        head = Problem1474.Solution(head, 3, 1);
        while (head != null) {            
            System.out.println(head.val);
            head = head.next;
        }
        /* Sample inputs:
         Armstrong Number: ArmstrongNumber.Solution(153) == true
        
         Check If a Number Is Majority Element in a Sorted Array: CheckIfANumberIsMajorityElementInASortedArray.Solution(3, new int[]{2,2,3,3,3}) == true
        
         Closest Binary Tree Search Value: 
        ClosestBinarySearchTreeValue.TreeNode tn = new ClosestBinarySearchTreeValue.TreeNode(4);
        tn.left = new ClosestBinarySearchTreeValue.TreeNode(2);
        tn.right = new ClosestBinarySearchTreeValue.TreeNode(5);
        tn.left.left = new ClosestBinarySearchTreeValue.TreeNode(1);
        tn.left.right = new ClosestBinarySearchTreeValue.TreeNode(3);
        
        int n = ClosestBinarySearchTreeValue.Solution(3.18281f,tn);
        System.out.println(n); */
    }
    
}
