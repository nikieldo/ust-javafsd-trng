package abstract_prgms;

public class MethodOverloading {
	private static void display(int a) {
		System.out.println("got integer data");
	}
	private static void display(String a) {
		System.out.println("got string object");
	}
	public static void main(String[] args) {
		display(1);
		display("hello");
	}

}
