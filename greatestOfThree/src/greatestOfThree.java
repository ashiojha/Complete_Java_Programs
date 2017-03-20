import java.util.Scanner;
public class greatestOfThree {
	public static void main(String[] args){
		int a,b,c,big;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a>b&&a>c)
			big=a;
		else if(b>a&&b>c)
			big=b;
		else
			big=c;
		System.out.println("largest number is "+big);
	}

}
