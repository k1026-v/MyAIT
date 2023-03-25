public class Books implements Comparable <Books> {

    String name;
    int yearPublishing;
    int price;

    public Books(String name, int yearPublishing, int price) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    @Override
    public int compareTo(Books anotherBook) {
        if (this.price == anotherBook.price) {
            return 0;
        } else if (this.price < anotherBook.price) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", price=" + price +
                '}';
    }
}
