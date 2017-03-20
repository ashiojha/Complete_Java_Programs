import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		LinkedList List=new LinkedList();
		List.add("Test");
		List.add(123);
		List.add(40.50F);
		List.add(false);
		System.out.println(List);
		LinkedList list1=new LinkedList();
		list1.add(111);
		list1.add(222);
		list1.add(333);
		list1.addAll(List);
        System.out.println(list1);
        List.remove(1);
	System.out.println(List);
	System.out.println(List.get(1));
	System.out.println(List.contains(1234));
	List.addAll(2,list1);
	System.out.println(List);
	/*for(Object obj:List)
	{
		System.out.println(obj);
	}*/
	/*Iterator it=List.iterator();
	while(it.hasNext())
	{
		Object obj=it.next();
		System.out.println(obj);
	}*/
	ListIterator it=List.listIterator();
	while(it.hasNext())
	{
		Object obj=it.next();
		System.out.println(obj);
		
	}
	while(it.hasPrevious())
	{
		Object obj=it.previous();
		System.out.println(obj);
	}
	LinkedHashSet ob=new LinkedHashSet();
	ob.add(12);
	ob.add("abc");
	ob.add(20.56F);
	ob.add(12);
	System.out.println(ob);
	}

}
