class Node {
	public int data;
	public Node next;
	public Node( int d){
		data = d;
	}
	
	void Append (Node data){
		Node curr = this;
		while (curr.next != null){
			curr = curr.next;
		}
		curr.next = data;
	}
	/* ************************** Question 2.2 ************************ */
//Recursive function to find the kth from last element in a linked list
	public static int ktoLast(Node curr, int k){
		//We have gotten to the end of the list, return 0
		if (curr == null){
			return 0;
		}
		//Incremement our "return value"
		int i = ktoLast(curr.next, k) + 1;
		if(i==k){
			System.out.println("The 4th from last is a " + curr.data);
		}
		return i;
	}

	//This is an integer wrapper that we will need

	/*
	 * Counts kth element from the last ll node using an data wrapper 
	 * @param Node curr - reference to head
	 * @param k - distance from end 
	 * @param ret - value of kth distanced node
	 * return : length of the list + the return IntWrapper 
	 */
	public int ktoLast2( Node curr, int k, IntWrapper ret ){

		if (curr == null){
			return 0;
		}

		int i = ktoLast2(curr.next, k, ret) + 1;

		if ( i == k ) { 
			ret.value = curr.data;
		}
		return i;
	}
	/* **********************End Question 2.2 ************************ */

	/* ************************* Question 2.3 ************************ */

	//Implement an algorithm to delete a Node in the middle of a linked list given only that node
	
	public boolean deleteMiddle(Node mid){
		if (mid == null){
			return false;
		}
		if (mid.next == null){
			return false;
		}
		mid.data = mid.next.data;
		mid.next = mid.next.next;
		return true;
	}
	/* *********************End  Question 2.3 ************************ */
	/* ************************* Question 2.4 ************************ */

	//Write code to partition a linked list around a value x so that all nodes less than x come before all nodes greater than x
	
	
}

