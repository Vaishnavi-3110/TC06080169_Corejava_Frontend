import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prog2 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> h =  new HashMap<String,Integer>();
		h.put("chitra", 700);
		h.put("rahul",800);
		h.put("vicky", 200);
		h.put("nikita",500);
		System.out.println(h);
		
		System.out.println(h.put("Chitra",54124));
		System.out.println(h);
		
		Set s = h.keySet();	
		System.out.println(s);
		
		Collection x = h.values();
		System.out.println(x);
		
		Set s1 = h.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "  "+m1.getValue());
			if (m1.getKey().equals("rahul"))
			{
				m1.setValue(1600);
			}
		}
		System.out.println(h);
		
		
	}
}
