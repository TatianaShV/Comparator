import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class PersonComparator implements Comparator<Person> {
    private int quantityWords;

    public PersonComparator(int quantityWords) {
        this.quantityWords = quantityWords;
    }

    @Override
    public int compare(Person o1, Person o2) {

        int surname1 = o1.getSurname().split(" ").length;
        int surname2 = o2.getSurname().split(" ").length;
        if (surname1 >= quantityWords && surname2 >= quantityWords) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (surname1 > surname2) {
            return 1;
        } else if (surname1 < surname2) {
            return -1;

        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

}
