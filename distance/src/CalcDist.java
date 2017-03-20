import java.util.Scanner;
public class CalcDist {
public static void main(String args[])
{
	int u,a,t;
	float d;
    Scanner s=new Scanner(System.in);
	System.out.println("enter u,a,t");
	u=s.nextInt();
	a=s.nextInt();
	t=s.nextInt();
	d=((u*t)+((1/2)*(a*t*t)));
	System.out.println(d);
	}
}
