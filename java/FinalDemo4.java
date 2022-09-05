package this_prgms;

public class FinalDemo4 {
	public void display() {
		System.out.println("this is a final method");
	}
  }
  class Main34 extends FinalDemo4 {
	  public final void display() {
		  System.out.println("the final method is overridden");
	  }
	  public static void main(String[] args) {
		  Main34 obj=new Main34();
		  obj.display();
	}

}
