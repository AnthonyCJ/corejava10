package inputoutput;

public class DataOutput {
    public void testPrintf() {
        int n = 159;
        float f = n;
        boolean flag = true;
        System.out.printf("十进制数%d ", n);
        System.out.printf("十六进制为%x ", n);
        System.out.printf("八进制为%o ", n);
        System.out.printf("定点浮点数为%f \n", f);
        System.out.printf("布尔数flag为%b ", flag);

    }
}
