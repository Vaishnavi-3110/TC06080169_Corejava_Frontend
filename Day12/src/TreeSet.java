
public class TreeSet 
{
	public static void main(String[] args) 
	{
		java.util.TreeSet t = new java.util.TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("C");

		System.out.println(t);
		System.out.println("--------------------------");
		
		java.util.TreeSet t1 = new java.util.TreeSet();
		
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("Z"));
		t1.add(new StringBuffer("A"));
		
		System.out.println(t1);
		
		
	}

}
