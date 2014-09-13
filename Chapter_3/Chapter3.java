import java.io.*;

class IntWrapper{
	int value;
}
public class Chapter3 {
	public static void main (String []args){
		System.out.println("Hello World!");
		Node a = new Node(212);// First value;

		Node b = new Node(33);//6th from last

		
		a.Append(new Node(95));//2nd from first - 5th from last
		a.Append(new Node(55));//3rd from first - 4th from last
		a.Append(new Node(42));//4th from first - 3rd from last
		a.Append(new Node(30));//5th from first - 2nd from last
		a.Append(b);//6th from first - 1st from last 
		int k = 0;
		IntWrapper wrap = new IntWrapper();

		// Calling 2.2
		int length =  a.ktoLast2( a , k, wrap);
		System.out.println("The " + k + "th element from the end of this list is a " + wrap.value + ". \nList Length = " + length );

		//Calling 2.3
		System.out.println("The second node of " + a.next.data + " has been deleted.\n" );
		boolean deletemiddle = a.deleteMiddle(a.next);
		if (deletemiddle == false) {
			System.out.println("Error : deleteMiddle failed");
		}
		System.out.println("Second node is now = " + a.next.data);
	}	
}


