/**
 * Created by vig on 11/21/16.
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<Parent, String> parentStringMap = new LinkedHashMap<>(20, 0.95f); // Hashmap (начальное макс значение количества бакетов, процент при котором начнет расширяться)
        Parent p1 = new Parent();
        Parent p2 = new ChildOne();
        Parent p3 = new ChildTwo();
        parentStringMap.put(p1, "1");
        parentStringMap.put(p2, "2");
        parentStringMap.put(p3, "3");
        parentStringMap.put(p1, "4");

        List<Parent> ss = new ArrayList<>();
        Collections.sort(ss, new Comparator<Parent>() { //(кого сортировать, как сортировать)
            @Override
            public int compare(Parent o1, Parent o2) {
                if(o1.id - o2.id != 0) {
                    return o1.name.compareTo(o2.name);
                }
                if (o1.name.compareTo(o2.name) != 0){
                    return o1.name.compareTo(o2.name);
                }
                return 0;
            }
        });
        System.out.println(parentStringMap);
    }

    static class Parent implements Comparable<Parent>{
        private long id;
        private String name;

        @Override
        public int hashCode() {
            return 21;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int compareTo(Parent o) {
            return (int) (o.id - this.id);
        }
    }

    static class ChildOne extends Parent {
        private int age;
    }

    static class ChildTwo extends Parent {
        int force;
    }
}
//Передаем свой компаратор для сравнения строк без учета регистра
/*Map<String, String> parentStringMap
               = new TreeMap<>(new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.compareToIgnoreCase(o2);
           }
       });
        parentStringMap.put("vasya", "1");
        parentStringMap.put("t", "2");
        parentStringMap.put("Vasya", "3");

        System.out.println(parentStringMap);

        or String.CASE_INSENSITIVE_ORDER);
        example: alp.sort(String.CASE_INSENSITIVE_ORDER);
        */