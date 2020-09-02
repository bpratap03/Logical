public class Linked_List {
	Node head;

	public void insertatFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	public void insertatlast(int data) {
		Node node = new Node(data);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public void printMiddle() {
		Node fastRun = head;
		Node slowRun = head;
		while (fastRun != null && fastRun.next != null) {
			fastRun = fastRun.next.next;
			slowRun = slowRun.next;
		}
		System.out.println(slowRun.data);
	}

	public void printLength() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println(count);
	}

	public void sumOfNode() {
		Node temp = head;
		int sum = 0;
		while (temp != null) {
			sum = sum + temp.data;
			temp = temp.next;
		}

		System.out.println(sum);
	}

	public void insertAtMiddle() {
		Node fastRun = head;
		Node slowRun = head;
		Node prev = null;
		Node node = new Node(100);
		while (fastRun != null && fastRun.next != null) {
			fastRun = fastRun.next.next;
			prev = slowRun;
			slowRun = slowRun.next;
		}
		prev.next = node;
		node.next = slowRun;

	}

	public void deleteMiddle() {
		Node fastRun = head;
		Node slowRun = head;
		Node prev = null;
		while (fastRun != null && fastRun.next != null) {
			fastRun = fastRun.next.next;
			prev = slowRun;
			slowRun = slowRun.next;
		}
		prev.next = slowRun.next;
	}

	public void reverseLinkList() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

	}

	public void deleteKth(int k) {
		int count = 1;
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (k == count) {
				prev.next = temp.next;
				temp = prev.next;
				count = 1;
			} else {
				prev = temp;
				temp = temp.next;
				count++;
			}

		}
	}

// delete every N element after M element
	public void linkdelete(int N, int M) {
		int count = 0;
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (count == M) {
				for (int i = 1; i <= N; i++) {
					prev.next = temp.next;
					temp = prev.next;
				}
				count = 0;
			} else {
				prev = temp;
				count++;
				temp = temp.next;
			}

		}

	}

	public void loop() {
		Node temp = head;
		Node prev = temp.next;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = prev.next;
	}

	public void detectLoop() {
		Node fast = head;
		Node slow = head;
		int flag = 0;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("\nloop");
		}

		else {
			System.out.println(" \nNo loop");
		}

	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
