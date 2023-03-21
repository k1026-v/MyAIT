import java.util.Date;

public class Fruits {
    String name;
    int weight;
     private Date expiration;

    public Fruits(String name, int weight, Date expiration) {
        this.name = name;
        this.weight = weight;
        this.setExpiration(expiration);
    }

    public int compareTo(Fruits anotherFruits) {
        if (this.getExpiration() == anotherFruits.getExpiration()){
            return 0;
        } else if (anotherFruits.getExpiration() != this.getExpiration()){
            return -1;
        } else {
            return 1;
        }
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
