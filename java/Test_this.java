package this_prgms;

public class Test_this {
	void print() {
	
		this.show();
    	System.out.println("Test_this::print");
	}
	void show() {
		System.out.println("Test_this::show");
	}
}
class Main88 {
	public static void main(String args[]) {
		Test_this t1=new Test_this();
		t1.print();
	}
	
	

}
