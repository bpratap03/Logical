package QueueUsingArray;

public class Demo {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueu(1);
		q.enqueu(2);
		q.enqueu(3);
		q.enqueu(4);
		q.enqueu(5);
		q.enqueu(6);
		System.out.println(q.dequeu());

	}

}
