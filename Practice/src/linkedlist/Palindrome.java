package linkedlist;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		
		LinkedList list = new LinkedList();
		int num;
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			num = sc.nextInt();
			list.add(new ListNode(num));
		}
		isPalindrome(list.head);
		list.print();
	}
	
	public static int isPalindrome(ListNode list) {
		if(list == null){
            return 0;
        } else if(list.next == null) {
            return 1;
        }
        ListNode head = list;
        ListNode slowPtr = list;
        ListNode fastPtr = list;
        ListNode prevPtr = list;
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prevPtr = slowPtr;
            slowPtr = slowPtr.next;
        }
        ListNode secondPart = null;
        if(fastPtr != null){
        	secondPart = slowPtr.next;
        } else {
        	secondPart = slowPtr;
        }
        
        prevPtr.next = null;
        secondPart = reverse(secondPart);
        while(secondPart != null) {
            if(head.val != secondPart.val){
                return 0;
            }
            head = head.next;
            secondPart = secondPart.next;
        }
		return 1;
	}
	public static ListNode reverse(ListNode list){
		ListNode curr = list;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list = prev;
        return list;
    }
}
