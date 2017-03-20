import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int table,n;
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=10;i++)
        	{table=n*i;
        	System.out.println(table);
        	}
	}

}
