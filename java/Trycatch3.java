package Day4;
import java.io.File;

public class Trycatch3 {
	public static void main(String[] args) {
		File file=new File("newFile.txt");
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("the new file is created");
			}
			else {
				System.out.println("the file already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
