import java.util.*;
//Reverse singly linked list 
public class RevSin {
	
	public RevSin next;
	public String data;
	public RevSin(String str){
		data = str;
	}
	
	public static void main(String[] args){
		RevSin av = new RevSin("1");
		insertNode(av, "2");
		insertNode(av, "3");
		insertNode(av, "4");
		insertNode(av, "5");
		printList(av);	
		av = ReverseSinglyLinkedList(av);
		printList(av);
	}
	
	public static void insertNode(RevSin head, String data){
		RevSin curr = head;
		RevSin temp = new RevSin(data);
		while (curr.next != null){
			curr = curr.next;
		}
		curr.next = new RevSin(data);
	}
	
	public static void printList(RevSin head){
		RevSin curr = head;
		while (curr != null){
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	public static RevSin ReverseSinglyLinkedList(RevSin head){
		int length = 0;
	
        RevSin prev=null, curr=head, next=curr.next; // We need 3 nodes for this operation
		if (curr == null){
			return null;
		}
		if(curr.next == null){
			return curr;
		}
        
		while (next != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void RecursivelyReverseSinglyLinkedList(RevSin prev, RevSin curr){
		curr.next = 
	
	
	}
	
	
	/*}
		RevSin curr = head;
		RevSin end;
		//First get the first point, and the middle point to meet in the middle.
		if (first == false){
			if (curr == end || curr.next == end){ //We have reached the middle
				ReverseSinglyLinkedList(curr.next, end, true)
			}
			else {
				ReverseSinglyLinkedList(curr.next, end, true)
				
		}
		
		//Then pop back the stack until we get a reversed list
		ReverseSinglyLinkedList(curr.next, end, true)
		if (first == false){//This lets us know that the first time we put the counter at the end.
			while(end.next == true){
				end = end.next;
			}
		}

		String temp = end.data;
		end.data = curr.data;
		curr.data temp;	

		}*/		 
}

class List {
	public List next;
}
