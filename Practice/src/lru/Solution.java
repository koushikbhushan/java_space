package lru;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public class Node {
        int key;
        int val;
        Node next;
        Node prev;
        
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    
    Node head;
    int capacity;
    Node end;
    Map<Integer, Node> accessList = new HashMap<Integer, Node>();
    
    public Solution(int capacity) {
        this.capacity = capacity;
    }
    
    public void delete(Node node) {
        if(node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        
        //Update prev reference of next node
        if(node.next != null) {
            node.next.prev = node.prev;
        } else {
            end = node.prev;
        }
    }
    
    public void insertFront(Node node) {
        node.next = head;
        node.prev = null;
        if(head != null) {
            node.next.prev = node;
        }
        head = node;
        if(end == null) {
            end = head;
        }
    }
    
    public int get(int key) {
        if(accessList.containsKey(key)) {
            return accessList.get(key).val;
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        Node node = null;
        if(accessList.containsKey(key)) {
            node = accessList.get(key);
            node.val = value;
            delete(node);
            insertFront(node);
        } else {
            if(accessList.size() == capacity) {
                accessList.remove(end.key);
                delete(end);
            }
            
            node = new Node(key, value);
            accessList.put(key, node);
        }
        insertFront(node);
    }
}
