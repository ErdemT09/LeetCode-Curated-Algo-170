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
public class Problem1474 {
    //Delete N Nodes After M Nodes of a Linked List
    //https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list
      public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      public static ListNode Solution(ListNode head, int m, int n)
      {
          ListNode temp = head;
          while (temp != null) { 
              int controlNumber = m-1;
              while (controlNumber > 0) {
                  if (temp.next != null) {
                      temp = temp.next;
                      controlNumber--;
                  }
                  else
                  {
                      return head;
                  }
              }
              controlNumber = n;
              while (controlNumber > 0) {                  
                  if (temp.next != null && temp.next.next != null) {
                    temp.next = temp.next.next;    
                  }
                  // return else ? 
                  controlNumber--;
              }
              temp = temp.next;
          }
          return  head;
      }
      
      public static ListNode ArrayToListNode(int [] arr)
      {
          ListNode head = new ListNode(arr[0]);
          ListNode temp = head;
          for(int i = 1; i<arr.length; i++)
          {
              temp.next = new ListNode(arr[i]);
              temp = temp.next;
          }
          return head;
      }
}
