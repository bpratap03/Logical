package TreeImplimentsation;

public class Tree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(12);

		Traversal.inOrdertraversal(root);
		System.out.println(" ");

		Traversal.preOrdertraversal(root);
		System.out.println(" ");

		Traversal.postOrdertraversal(root);
		System.out.println(" ");

		System.out.println(Traversal.isFullyBinar(root));

		Traversal.printLevel(root);

		int x = Traversal.getSize(root);
		System.out.println("\n" + x);

		int y = Traversal.getMax(root);
		System.out.println("\n" + y);
		
		int z=Traversal.getHeight(root);
		System.out.println("\n" + z);
		
		System.out.println(" ");
		Traversal.printkThNode(root,2);
		
		System.out.println(" ");
		Traversal.printLeftView(root);
		
		
	}

}
