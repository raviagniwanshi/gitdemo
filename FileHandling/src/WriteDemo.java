import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) {


   DataOutputStream stream = null;

   try {
	stream = new DataOutputStream(new FileOutputStream("dataio"));
	int i = 10;
	float f = 12.34f;
	char ch = 'A';
	boolean flag = true;
	stream.writeInt(i);
	stream.writeFloat(f);
	stream.writeChar(ch);
	stream.writeBoolean(flag);
	System.out.println("Data written in file");
} catch (IOException e) {
	e.printStackTrace();
} finally {
	if(stream != null) {
		try {
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
}