package string;

public class CodePointAndCodeElement {
    /**
     * @param str 字符串
     * @param i 代码单元位置
     */
    public void testCodeElement(String str, int i) {
        // length 方法将返回采用UTF-16 编码表示的给定字符串所需要的代码单元数量
        int n = str.length();
        // 返回位置n的代码单元
        char c = str.charAt(i);

        System.out.println("字符串" + str + "的代码单元数量为" + n);
        System.out.println("字符串" + str + "第" + i + "个代码单元字符为" + c);
    }

    /**
     * 测试码点
     * @param str 字符串
     * @param i 码点位置
     */
    public void testCodePoint(String str, int i) {
        // 码点数量
        int codePointCount = str.codePointCount(0, str.length());
        // 第i个码点值
        int index = str.offsetByCodePoints(0, i);
        int codePoint = str.codePointAt(index);

        System.out.println("字符串" + str + "的码点数量为" + codePointCount);
        System.out.println("字符串" + str + "第" + i + "个码点值为" + codePoint);

        // 遍历一个字符串，并且依次査看每一个码点，转换为数组
        int[] codePoints = str.codePoints().toArray();
        System.out.print("字符串" + str + "全部码点值为：");
        for (int j : codePoints ) {
            System.out.print(j + "/");
        }
    }
}
