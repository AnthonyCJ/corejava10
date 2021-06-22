package array;

import java.util.Arrays;

public class ForEach {
    public void testForEach() {
        int[] a = new int[]{1, 2, 3};
        for (int elem : a) {
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(a));
    }

}
