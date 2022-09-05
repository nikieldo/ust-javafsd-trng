package this_prgms;

public class FinalClass {
 
		public void display() {
			System.out.println("this is a final method");
		}
	}
	class Main89 extends FinalClass {
		public void display() {
			System.out.println("the final method is overridden");
		}
		public static void main(String[] args) {
			Main89 obj=new Main89();
			obj.display();
		}
	}


