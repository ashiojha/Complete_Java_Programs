import java.util.Scanner;
public class Addition {
	public static void main(String[] args){
	int a,b,c=0;
	Scanner s=new Scanner (System.in);
	System.out.println("enter a number");
	a=s.nextInt();
	System.out.println("enter another number");
	b=s.nextInt();
	c=a+b;
	System.out.println("sum:"+c);
	}
}
