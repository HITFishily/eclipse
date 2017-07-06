package webcoding;
import java.io.*;
public class Io {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\"
				+ "webcoding\\src\\webcoding\\io.txt");
		InputStream in = new FileInputStream(f);
		File ff = new File("C:\\Users\\Administrator\\eclipse-workspace\\"
				+ "webcoding\\src\\webcoding\\io1.txt");
		OutputStream out = new FileOutputStream(ff);
		byte[] b = new byte[(int) (f.length()+1)];
		in.read(b);
		out.write(b);
		in.close();
		out.close();
	}
}
