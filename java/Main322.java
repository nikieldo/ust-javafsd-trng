package Day4;
import java.io.File;
//File newFile;
public class Main322 {
	static File newFile=new File("C:\\Users\\ustjavafsdb215\\newFile");
	public static void main(String[] args) {
		//File newFile;
		//File file=new File("  C:\\Users\\ustjavafsdb215");
		String[] fileList=newFile.list();
		for(String str:fileList) {
			System.out.println(str);
		}
	}

}
