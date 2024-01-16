import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
		h.add(null);
		System.out.println(h.add("Omkar"));
		System.out.println(h.add(10.2f));
		System.out.println(h);
		
		
		System.out.println("----------------------------");
		
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add(10);
		h1.add("A");
		h1.add(2);
		h1.add(10.2f);
		h.add(null);
		System.out.println(h1.add("Omkar"));
		System.out.println(h1.add(10.2f));
		System.out.println(h1);
		
		
	}

}
