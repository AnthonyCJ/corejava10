package array;

import java.util.Arrays;
public class ArrayCopy {
    public void testArrayCopy() {
        int[] a = new int[]{1, 2, 3};
        a = Arrays.copyOf(a, 2 * a.length);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
