

	import java.io.DataInputStream;
	import java.io.FileInputStream;
	import java.io.IOException;

	public class ReadDemo {
		public static void main(String[] args) {
			FileInputStream fileInputStream = null;
			DataInputStream stream = null;
			try {
				fileInputStream =  new FileInputStream("dataio");
				stream = new DataInputStream(fileInputStream);
				System.out.println(stream.readInt());
				System.out.println(stream.readFloat());
				System.out.println(stream.readChar());
				System.out.println(stream.readBoolean());
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
