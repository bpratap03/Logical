package TreeImplimentsation;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

	public static void inOrdertraversal(Node root) {
		if (root != null) {
			inOrdertraversal(root.left);
			System.out.print(root.data + " ");
			inOrdertraversal(root.right);
		}
	}

	public static void preOrdertraversal(Node root) {

		if (root != null) {
			System.out.print(root.data + " ");
			preOrdertraversal(root.left);
			preOrdertraversal(root.right);
		}

	}

	public static void postOrdertraversal(Node root) {
		if (root != null) {
			postOrdertraversal(root.left);
			postOrdertraversal(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static boolean isFullyBinar(Node root) {
		if (root.left != null && root.right != null) {
			return isFullyBinar(root.left) && isFullyBinar(root.right);
		} else if (root.left == null && root.right == null) {
			return true;
		} else {
			return false;
		}
	}

	public static void printLevel(Node root) {
		{
			if (root == null)
				return;
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while (!q.isEmpty()) {
				Node curr = q.poll();
				System.out.print(curr.data + " ");
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
	}

	public static int getSize(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + getSize(root.left) + getSize(root.right);
		}
	}

	public static int getMax(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
		}
	}

	public static int getHeight(Node root) {
		if (root == null) {
			return 0;
		} else {
			int x = getHeight(root.left);
			int y = getHeight(root.right);

			if (x > y) {
				return x + 1;
			} else {
				return y + 1;
			}
		}

	}

	static void printkThNode(Node root, int k) {

		if (root == null)
			return;

		if (k == 0) {
			System.out.println(root.data + " ");
		} else {
			printkThNode(root.left, k - 1);
			printkThNode(root.right, k - 1);
		}

	}

	static int maxLevel = 0;

	static void printLeft(Node root, int level) {
		if (root == null) {
			return;
		}

		if (maxLevel < level) {
			System.out.println(root.data + " ");
			maxLevel = level;
		}
		printLeft(root.left, level + 1);
		printLeft(root.right, level + 1);
	}

	static void printLeftView(Node root) {
		printLeft(root, 1);
	}

}
