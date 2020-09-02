
public class MergeTwoString {
	public static void main(String[] args) {
		String S1 = "Hello";
		String S2 = "Babyyyy";
		int firstLen = S1.length();
		int secondLen = S2.length();
		int x = 0;
		StringBuilder result = new StringBuilder();
		if (firstLen <= secondLen) {
			for (int i = 0; i < firstLen; i++) {
				for (int j = i; j <= i; j++) {
					result.append(S1.charAt(i));
					result.append(S2.charAt(j));
					x = j;
				}
			}
			for (int k = x + 1; k < secondLen; k++) {
				result.append(S2.charAt(k));
			}
			System.out.println(result);
		}
		else
		{
			for (int m = 0; m< secondLen; m++)
			{
				for (int l = m; l <= m; l++)
				{
					result.append(S1.charAt(l));
					result.append(S2.charAt(m));
					x = l;
				}
			}
			for (int n = x + 1; n < firstLen; n++) {
				result.append(S1.charAt(n));
			}
			System.out.println(result);
		}
	}
}
