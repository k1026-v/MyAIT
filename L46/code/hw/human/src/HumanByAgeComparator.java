import java.util.Comparator;

public class HumanByAgeComparator implements Comparator <Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.age- o2.age;
    }
}
