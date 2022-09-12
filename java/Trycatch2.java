package Day4;

public class Trycatch2 {
	public static void main(String[] args) {
		try {
			int divideByZero=5/0;
			System.out.println("rest of code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("arithmeticException=>" +e.getMessage());
		}
		finally {
			System.out.println("this is the finally block");
		}
	}

}
