import java.util.Scanner;

class LinkedList {
	Node head; // head of the list

// 	Linked List node
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

    // 	Print the nth node from the last
	void printNthFromLast(int N)
	{
		int len = 0;
		Node temp = head;

		//count the number of nodes in Linked List
		while (temp != null) {
			temp = temp.next;
			len++;
		}

		// check if value of N is not more than length of Linkedlist
		if (len < N)
			return;

		temp = head;

		for (int i = 1; i < len - N + 1; i++)
			temp = temp.next;
		System.out.println(temp.data);
	}
	

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// Main function
	public static void main(String[] args)
	{
		LinkedList linkedlist = new LinkedList();
		//Pushing the values
		linkedlist.push(20);
		linkedlist.push(4);
		linkedlist.push(15);
		linkedlist.push(35);
		
		// calling the function
		linkedlist.printNthFromLast(2);
	}
}
