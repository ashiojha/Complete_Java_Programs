
public class B extends Thread{
public void run(){
	for(int j=1;j<=5;j++)
	{
		System.out.println("\t From thread B:j="+j);
		if(j==3) stop();
	}
	System.out.println("exit from b");
}
}
