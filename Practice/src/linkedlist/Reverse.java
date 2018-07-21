package linkedlist;

import java.util.Scanner;

public class Reverse {
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
		list.head = reverse(list.head);
		list.print();
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
