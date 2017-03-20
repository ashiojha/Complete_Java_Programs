
public class A extends Thread {
public void run(){
	for(int i=1;i<=5;i++)
	{
		if(i==1) yield();
		System.out.println("\t From thread A:i="+i);
	}
	System.out.println("exit fom a");
}
}
