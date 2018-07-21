package linkedlist;

public class LinkedList {
	ListNode head;
	
	public void add(ListNode node){
		node.next = head;
		head = node;
	}
	
	public void print(){
		ListNode node = head;
		while(head != null){
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println("NULL");
	}
}
