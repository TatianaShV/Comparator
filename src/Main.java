import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(new Person("Ivanova", "Liza", 15),
                new Person("Muhhamad Aly", "Mehdy", 42),
                new Person("Stepanov", "Alexandr", 40),
                new Person("Gayle", "Yulya", 18),
                new Person("von Wiesen", "Peter", 67)));


        list.sort(new PersonComparator(2));
        System.out.println(list);
    }

}