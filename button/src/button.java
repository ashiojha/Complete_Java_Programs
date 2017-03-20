import java.awt.Button;

public class button implements Clickable,Accesible,Runnable {
	public void print(){
		Clickable.super.print();
		Accesible.super.print();
		
	}
public void run(){
	
}
public void hide(){
	System.out.println("I am not doing any hiding");
}
public void dosomething(){
	System.out.println();
	public static void main(String[] args)
	{
		Button button=new Button();
		button.click();
		button.access();
		button.print();
	}
}
}
