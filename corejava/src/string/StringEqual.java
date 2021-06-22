package string;

public class StringEqual {
    public void testStringEqual(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("字符串相等！");
        }
        else {
            System.out.println("字符串不相等！");
        }
    }
    public void testStringEqualIgnoreCase(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("无视大小写字符串相等！");
        }
        else {
            System.out.println("无视大小写字符串不相等！");
        }
    }
}
