import java.io.*;

class IntWrapper{
	int value;
}




public class Chapter3 {
	public static void main (String []args){
		System.out.println("Hello World!");
		Node a = new Node(212);
		Node b = new Node(33);//6th from last
		a.Append(new Node(95));//5th from last
		a.Append(new Node(55));//4th from last
		a.Append(new Node(42));//3rd from last
		a.Append(new Node(30));//2nd from last
		a.Append(b);//1st from last 
		int k = 0;
		IntWrapper wrap = new IntWrapper();
 		int length =  a.ktoLast2( a , k, wrap);

		//NOTE : it does play nicely with a very first element.
		System.out.println("The " + k + "th element from the end of this list is a " + wrap.value + ". \nList Length = " + length );
		assert(1==2):"Sucks to be you dude";
		/*while (a.next != null){
			System.out.println(a.data);
			a = a.next;
		}
	}
	/*public static void recurse(int a){
		if ( a <= 0 ){
			return;
		}
		System.out.println("Your number is " + a) ;
		recurse(a-1);*/
	}	
}


