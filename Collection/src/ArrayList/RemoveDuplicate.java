package ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			al.add(new Integer(i));
			al.add(5);
		}
		System.out.println(al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (Integer x:al)
		{
			if(!al1.contains(x))
			{
				al1.add(x);
			}
		}
	
		System.out.println(al1);
	}
	
	

}
