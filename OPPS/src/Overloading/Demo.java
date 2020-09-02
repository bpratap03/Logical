package Overloading;

public class Demo {

	public static void main(String[] args) {
		Shop sh = new Shop();
		sh.doWork("raju", "kapada dikha do");
		sh.doWork("raju", "pani do", 1);
		TypePromotion tp = new TypePromotion();
		tp.m1(10);
		TypePromtion1 tp1= new TypePromtion1();
		//tp1.m1(10, 10); ambiguity
		OverLoadingConcept3 ol= new OverLoadingConcept3();
		//ol.m1(null); ambiguty problem into promotion null to string or SB.
		String s= null;
		ol.m1(s);
		StringBuffer sb= null;
		ol.m1(sb);
		
		OverLoadingConcept4 ol4=new OverLoadingConcept4();
		ol4.m1(null);
	}

}