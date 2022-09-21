package Java8;
interface Sayable2 {
	default void say() {
		System.out.println("hello,this is default method");
	}
	void sayMore(String msg);
}
public class DefaultMethods implements Sayable2 {
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.say();
		dm.sayMore("work is worship");
	}

}
