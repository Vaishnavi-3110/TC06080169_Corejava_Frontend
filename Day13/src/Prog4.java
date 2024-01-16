
public class Prog4 extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getClass());
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) 
	{
		Prog4 t1 = new Prog4();
		Prog4 t2 = new Prog4();
		Prog4 t3 = new Prog4();
		Prog4 t4 = new Prog4();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
