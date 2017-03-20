import java.io.BufferedReader;

public class GenerateBill {
public static void main(String args[]){
	GetPlanFactory planFactory=new planFactory();
	System.out.println("enter the name of the plan for which bill is generated");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String planName=br.readLine();
	System.out.println("Bill amount for"+planName+"of"+units+"units is");
	p.getRate();
	p.calculateBill(units);
}
}
