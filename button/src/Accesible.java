
public interface Accesible {
default void access(){
	System.out.println("access");
}
default void print(){
	System.out.println("Accessible");
}
}
