import java.io.*;
import java.lang.Thread;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream("test.txt")));

        	while((c = in.read()) >= 0) {
                try {
                    Thread.sleep(150);
				    System.out.print((char)c);
                } catch(Exception e) {
                    System.out.print(e);
                }
			}

            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}