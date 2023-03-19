import java.util.ArrayList;

public class Basket {

    ArrayList <String> basket;

    public Basket() {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProducts=" + basket +
                '}';
    }

    public ArrayList<String> add(Product dress1) {
        ArrayList <String> basket= new ArrayList<>();
        basket.add(String.valueOf(dress1));
        return basket;
    }
}
