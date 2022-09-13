package Day4;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class Main00 {
	public  static void main(String args[]) {
		String data="THIS IS A LINE OF TEXT INSIDE THE FILE";
		try {
			OutputStream out=new FileOutputStream("output.txt");
			byte[] dataBytes=data.getBytes();
			out.write(dataBytes);
			System.out.println("data is written to the file");
			out.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
