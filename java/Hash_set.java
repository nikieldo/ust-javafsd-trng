package Day5;
import java.util.HashSet;

public class Hash_set {
	public static void main(String[] args) {
		HashSet<Integer>evenNumber=new HashSet<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet:" +evenNumber);
		HashSet<Integer>numbers=new HashSet<>();
		numbers.addAll(evenNumber);
		System.out.println("New HashSet:" +numbers);
	}

}
