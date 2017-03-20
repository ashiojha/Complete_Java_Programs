
public class C extends Thread {
public void run(){
	for(int k=1;k<=5;k++){
		System.out.println("\t From thread C :k="+k);
		if(k==1)
			try{
				sleep(1000);
				
			}
		catch (Exception e)
		{
			
		}
		
	}
	System.out.println("exit from C");
}
}
