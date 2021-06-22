package arrayList;

import java.util.*;

/**
 * This program demonstrates the ArrayList class
 * @version 1.11 2021-06-16
 * @author XCJ
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array list with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 75000, 2000, 12, 27));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("TonyTester", 40000, 1990, 3, 15));

//        Employee e = staff.get(0);
//        System.out.println(e.getName());
//        // raise everyone's salary by 5%
//        for (Employee e : staff)
//            e.raiseSalary(5);
//
//        // print out information about all Employee objects
//        for (Employee e : staff)
//            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay = "
//                    + e.getHireDay());

        // 测试自动装箱、拆箱
        Integer n = 1;
        Double x = 2.0;
        //System.out.println(true ? n : x);
        Integer m = Integer.valueOf("12", 5);
        System.out.println(m);
    }
}
