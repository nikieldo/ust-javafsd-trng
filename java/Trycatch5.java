package Day4;
import java.io.FileInputStream;
import java.io.InputStream;

public class Trycatch5 {
	public static void main(String args[]) {
		byte[] array=new byte[100];
		try {
			InputStream input=new FileInputStream("input.txt");
			System.out.println("available bytes in files" +input.available());
			input.read(array);
			System.out.println("data read from the file");
			String data=new String(array);
			System.out.println(data);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}
