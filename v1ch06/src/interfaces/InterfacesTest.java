package interfaces;

interface A {
    public static final String MSG = "ww";
    public abstract void print();   // abstract method
        }

interface B {
    public abstract void get();
        }

// 接口允许多继承
interface D extends A, B {

}
class C implements A, B {
    public void print() {
        // 覆盖接口A的抽象方法
        System.out.println("This is the abstract method from interface A!");
    }
    public void get() {
        System.out.println("This is the abstract method from interface B!");
    }
}
public class InterfacesTest {
    public static void main(String[] args) {
        C c = new C();  // 实例化类
        A a = c;    //
        B b = c;
        a.print();
        b.get();
        System.out.println(A.MSG);  // 直接访问全局变量
    }
}
