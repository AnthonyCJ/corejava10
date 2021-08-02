package shuffle;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


/**
 * This program demonstrates the random shuffle and sort algorithms.
 * @version 1.0 2021-08-02
 * @author XCJ
 */
public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 49; i++)
            numbers.add(i);
        // 随机打乱元素
        Collections.shuffle(numbers);
        // 取前6个
        List<Integer> winningCombination = numbers.subList(0, 6);
        // 升序排序
        Collections.sort(winningCombination);

        System.out.println(winningCombination);
    }
}
