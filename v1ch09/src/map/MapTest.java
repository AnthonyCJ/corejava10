package map;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapTest {
    public static void main(String[] args) {
//        Map<String, Employee> staff = new HashMap<>();
        var staff = new LinkedHashMap<String, Employee>();  // LinkedHashMap
        staff.put("144-25-5464", new Employee("AmyLee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gray Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        // test
        Iterator<String> keySetIter = staff.keySet().iterator();
        while (keySetIter.hasNext()) {
            System.out.println(keySetIter.next());
        }

        Iterator<Employee> valuesIter = staff.values().iterator();
        while (valuesIter.hasNext()) {
            System.out.println(valuesIter.next());
        }

//        // put all entries
//
//        System.out.println(staff);
//
//        // remove and entry
//
//        staff.remove("567-24-2546");
//
//        // replace an entry
//
//        staff.put("456-62-5527", new Employee("Francesca Miller"));
//
//        // look up a value
//
//        System.out.println(staff.get("157-62-7935"));
//
//        // iterate through all entries
//
//        staff.forEach((k, v) ->
//                System.out.println("key=" + k + "value=" + v));
    }
}
