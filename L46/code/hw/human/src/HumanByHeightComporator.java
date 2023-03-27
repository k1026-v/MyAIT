import java.util.Comparator;

public class HumanByHeightComporator implements Comparator<Human> {


    @Override
    public int compare(Human o1, Human o2) {
        return o1.height- o2.height;
    }
}

