import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(new Person("Ivanova", "Liza", 15),
                new Person("Muhhamad Aly", "Mehdy", 42),
                new Person("Stepanov", "Alexandr", 40),
                new Person("Gayle", "Yulya", 18),
                new Person("von Wiesen", "Peter", 67)));

        Comparator<Person> comparator = (o1, o2) -> {
            int surname1 = o1.getSurname().split(" ").length;
            int surname2 = o2.getSurname().split(" ").length;
            if (surname1 >= 2 && surname2 >= 2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (surname1 > surname2) {
                return 1;
            } else if (surname1 < surname2) {
                return -1;

            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(list, comparator);
        System.out.println(list);
    }

}