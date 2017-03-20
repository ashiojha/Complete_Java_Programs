
public class B extends Thread{
public void run(){
	for(int j=1;j<=5;j++)
	{
		System.out.println("\tFrom thread B:j="+j);
	}
	System.out.println("exit from B");
}
}
