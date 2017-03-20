import java.util.Scanner;
public class fibonacciSeries {
	public static void main(String[] args){
		int n,first=0,second=1,next;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of terms of series");
		n=s.nextInt();
		System.out.println("fibonacci series is:");
		System.out.println(0);
		System.out.println(1);
		for(int i=0;i<n-2;i++)
		{
			next=first+second;
			first=second;
			second=next;
			System.out.println(next);

		}
		
	}

}
