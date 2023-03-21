public class House implements Comparable <House> {

    int area;
    int price;
    String city;



    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.area== anotherHouse.area){
            return 0;
        } else if (this.area< anotherHouse.area ){
          return -1;
        } else {
            return 1;
        }
    }
}
