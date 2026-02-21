
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * LinkedList class to manage the list of nodes
 */
public class LinkedList {
    private Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    /**
     * Insert a new node with the given data.
     * This is a simple version that adds to the end of the list.
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        
        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }
        
        // Otherwise, find the last node and add after it
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        
        // Now current is the last node, so link the new node after it
        current.setNext(newNode);
    }
    
    /**
     * Delete a node with the given data from the list.
     * Returns true if a node was deleted, false otherwise.
     */
    public boolean delete(int data) {
    	
    	//Case 1
    	if (head==null) {
    		return false;
    	}
    	
    	//Case 2
    	if (head.getData() == data) {
    		head = head.getNext();
    		return true;
    	}
    	
    	//Case 3
    	Node current = head;
    	while (current.getNext() != null && current.getNext().getData() != data) {
    		current = current.getNext();
    	}
    	if (current.getNext() != null) {
    		current.setNext(current.getNext().getNext());
    		return true;
    	} 
    	
    	return false;
    }
    	
    	
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node current = head;
        System.out.print("Our List: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
