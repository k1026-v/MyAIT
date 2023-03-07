import org.w3c.dom.ls.LSOutput;

public class Wine {

    String name;
    String sort;
    Integer year;
    Wine myWine = new Wine(); {
    myWine.name="Chardonnay Riserva";
    myWine.sort="dry";
    myWine.year=2018;
    myWine.toString();
    }

        Wine myWine1 = new Wine(); {
    myWine.name="Kanonkop Kadette Rosé";
    myWine.sort="dry";
    myWine.year=2022;
        }

    Wine myWine2 = new Wine(); {
    myWine.name="Blandy's Vintage Bual";
    myWine.sort="desert";
    myWine.year=1972;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';
    }
}





