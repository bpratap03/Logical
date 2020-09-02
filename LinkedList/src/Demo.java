
public class Demo {

	public static void main(String[] args) {
		Linked_List ll = new Linked_List();
		
		ll.insertatFirst(10);
		ll.insertatFirst(20);
		ll.insertatFirst(30);
		ll.insertatFirst(40);
		ll.display();
		//ll.loop();

		System.out.println(" ");
		ll.reverseLinkList();
		ll.display();

	}

}
