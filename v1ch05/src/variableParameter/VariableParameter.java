package variableParameter;

public class VariableParameter {
    /**
     * 可变参数方法
     * @param values 参数数组
     * @return max elem
     */
    public  static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double x : values) {
            if (x > largest) largest = x;
        }
        return largest;
    }

    // test
    public static void main(String[] args) {
        double x = max(1, 40.5, 20.32);
        System.out.println("最大值 = " + x);
    }
}
