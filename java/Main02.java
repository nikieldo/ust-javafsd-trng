package Day4;
import java.io.FileOutputStream;
public class Main02 {
	public static void main(String[] args) {
		String data="this is a line of text inside the file";
		try {
			FileOutputStream output=new FileOutputStream("output.txt");
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	

}
