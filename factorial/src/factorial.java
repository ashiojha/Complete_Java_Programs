import java.util.Scanner;
public class factorial {
public static void main(String[] args){
	int fact=1,n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number whose factorial is to be found");
	n=s.nextInt();
	for(int i=1;i<=n;i++)
		fact=fact*i;
	System.out.println("factorial of "+n+" is "+fact);
}
}
