package Java8;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface MyInterface {
	double getPiValue();
}
public class Main_l1 {
	public static void main(String[] args) {
		MyInterface ref;
		ref=()->3.1415;
		System.out.println("value of pi=" +ref.getPiValue());
	}

}
