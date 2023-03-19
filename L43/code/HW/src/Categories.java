import java.lang.reflect.Array;
import java.util.ArrayList;

public class Categories {

    String name;
    ArrayList <String> products;

    public Categories(String name, ArrayList<String> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

}
