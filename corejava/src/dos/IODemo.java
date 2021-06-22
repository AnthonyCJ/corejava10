package dos;

import inputoutput.DataInput;
import inputoutput.DataOutput;
import inputoutput.TestFile;

import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
//        DataInput dataInput = new DataInput();
//        dataInput.testInput();
//        DataOutput dataOutput = new DataOutput();
//        dataOutput.testPrintf();
        TestFile testFile = new TestFile();
        testFile.testReadFile();
    }
}
