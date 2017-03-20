import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
System.out.println("initial size of al"+al.size());
al.add("c");
al.add("a");
al.add("e");
al.add("b");
al.add("f");
al.add(1,"A2");
System.out.println("size of al after additions is"+al.size());
System.out.println("contents of al"+al);
al.remove("f");
System.out.println("contents of al"+al);

	}

}
