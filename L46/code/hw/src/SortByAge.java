import java.util.Comparator;

public class SortByAge implements Comparator <Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.age-d2.age;
    }
}
