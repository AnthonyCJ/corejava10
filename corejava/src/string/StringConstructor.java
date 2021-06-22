package string;

public class StringConstructor {
    public void testStringBuilder() {
        String str1 = "Hello";
        String str2 = "world!";
        char ch = ',';
        // 构建空的字符串构建器
        StringBuilder stringBuilder = new StringBuilder();
        // 每次添加一部分内容时，调用append方法
        stringBuilder.append(str1);
        // 需要构建字符串时调用toString()方法，可以得到一个String 对象， 其中包含了构建器中的字符序列。
        String completedString1 = stringBuilder.toString();
        System.out.println(completedString1);

        stringBuilder.append(ch);
        String completedString2 = stringBuilder.toString();
        System.out.println(completedString2);

        stringBuilder.append(str2);
        String completedString3 = stringBuilder.toString();
        System.out.println(completedString3);
    }
}
