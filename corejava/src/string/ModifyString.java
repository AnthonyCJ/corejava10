package string;

public class ModifyString {
    public void testModifyString() {
        String greeting = "Hello";
        System.out.println(greeting);

        greeting = greeting.substring(0,3) + "p!";
        System.out.println(greeting);
    }
}
