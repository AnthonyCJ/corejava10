package abstractClasses;

/**
 * This program demonstrates abstract classes.
 * @version 1.01 2004-02-21
 * @author Cay Horstmann
 */
public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        // 由于不能构造抽象类Person对象，所以变量p永远不会引用Person对象
        // 此处抽象类的变量调用抽象方法时，调用的是引用的已实现该方法的子类对象对应方法。
        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}