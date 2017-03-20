
public class A extends Thread {
public void run(){
	for(int i=1;i<=5;i++)
	{
		System.out.println("\tFrom threadA:i="+i);
	}
	System.out.println("exit from A");
}
}

	
