import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
		

	}

}
