package Day5;
import java.util.ArrayList;

public class Arraylist_strng {
	public static void main(String[] args) {
		ArrayList<String>languages=new ArrayList<>();
		languages.add("java");
		languages.add("kotlin");
		languages.add("c++");
		System.out.println("arraylist:" +languages);
		languages.set(2, "javascript");
		System.out.println("modified arraylist:" +languages);
	}

}
