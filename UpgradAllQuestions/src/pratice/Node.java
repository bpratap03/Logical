package pratice;

public class Node {
	
	Node next;
	int data;
	
	Node(int data)
	{
		this.data=data;
	}

}


class Linklist
{
	Node head;
	
	public void inserFirst(int data)
	{
		Node node = new Node(data);
		node.next=head;
		head=node;
	}
	public void print()
	{
		Node temp=head; 
		while(temp!=null)
		{
			
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
}

