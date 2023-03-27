import java.util.Comparator;

public class HumanBynWeightComporator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.weight- o2.weight ;
    }
}
