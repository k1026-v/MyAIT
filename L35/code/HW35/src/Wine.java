import org.w3c.dom.ls.LSOutput;

public class Wine {
   String name;
    String sort;
    Integer year;

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';
    }
      public int onStock (int n){
     System.out.println("On stock are: " +n+ " b.");
     return n;
    }
    public Integer getYear() {
        return year;
    }
}





