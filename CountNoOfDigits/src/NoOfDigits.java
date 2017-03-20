import java.util.Scanner;
public class NoOfDigits {
	public static void main(String[] args){
		int n,temp,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println("no. of digits of the number "+temp+" is "+count);
		
	}

}
