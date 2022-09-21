package Java8;
import java.util.List;
import java.util.ArrayList;
public class Java8Tester {
	public static void main(String args[])  {
		List names=new ArrayList();
		names.add("mahesh");
		names.add("suresh");
		names.add("ramesh");
		names.add("naresh");
		names.add("kalpesh");
		names.forEach(System.out::println);
	}

}
