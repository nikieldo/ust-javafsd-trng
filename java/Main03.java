package Day4;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main03 {
	public static void main(String[] args) {
		char[] array=new char[100];
		try {
			FileReader file=new FileReader("input.txt");
			BufferedReader input=new BufferedReader(file);
			input.read(array);
			System.out.println("data in the file");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
