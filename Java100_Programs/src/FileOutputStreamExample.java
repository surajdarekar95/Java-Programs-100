import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//How to write data in text file using java program

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {

		FileOutputStream fio = new FileOutputStream(".//FIO");
		fio.write(67);
		fio.close();
	}

}
