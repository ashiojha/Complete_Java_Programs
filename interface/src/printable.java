
public interface printable {
	void print();

}
class a6 implements printable{
	public void print(){System.out.println("hello");}
	public static void main(String args[]){
		a6 obj=new a6();
		obj.print();
	}
}
