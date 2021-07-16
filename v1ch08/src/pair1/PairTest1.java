package pair1;

/**
 * @version 1.0 2021-06-26
 * @author XCJ
 */
public class PairTest1
{
    public static void main(String[] args)
    {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        System.out.println("middle = " + ArrayAlg.getMiddle(3.15, 2, 1));
        //System.out.println("middle = " + ArrayAlg.getMiddle(words));
        //System.out.println("middle = " + ArrayAlg.getMiddle(words[0], words[1], words[2], words[3], words[4]));
    }
}

class ArrayAlg
{
    /**
     * Gets the minimum and maximum of an array of strings
     * @param a an array of strings
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length ==0) return null;
        String min = a[0];
        String max = a[0];
        for (String s : a) {
            if (min.compareTo(s) > 0) min = s;
            if (max.compareTo(s) < 0) max = s;
        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}
