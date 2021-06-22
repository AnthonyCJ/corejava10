package staticInnerClass;


/**
 * This program demonstrates the use of static inner classess.
 * @version 1.0 2021-06-22
 * @author XCJ
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++) {
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair pair = ArrayAlg.minmax(d);
        System.out.println("min = " + pair.getFirst());
        System.out.println("max = " + pair.getSecond());
    }
}

class ArrayAlg {
    /**
     * A pair of floating-point numbers
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         * Constructors a pair from rwo floating-point numbers
         * @param f the first number
         * @param s the second number
         */
        public Pair(double f, double s) {
            this.first = f;
            this.second = s;
        }

        /**
         * Returns the first number of the pair
         * @return the first number
         */
        public double getFirst() { return this.first; }

        /**
         * Returns the second number of the pair
         * @return the second number
         */
        public double getSecond() { return this.second; }
    }

    /**
     * Computes both the minimum and the maximum of an array
     * @param values an array of floating-point numbers
     * @return a pair whose first element is the minimum and whose
     * second element is the maximum
     */
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new Pair(min, max);
    }
}