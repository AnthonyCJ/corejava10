package inputoutput;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
public class TestFile {
    public void testReadFile() throws IOException {
        Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
    }
    public void testWriteFile() throws IOException {
        PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");
    }
}
