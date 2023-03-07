public class Main {
    public static void main(String[] args) {

        class Wine {

            String name;

            String sort;

            Integer year;
        }

        Wine myWine= new Wine();
            myWine.name = "Chardonnay Riserva";
            myWine.sort = "dry";
            myWine.year = 2018;

        Wine myWine1= new Wine();

            myWine1.name = "Kanonkop Kadette Rosé";
            myWine1.sort = "dry";
            myWine1.year = 2022;


        Wine myWine2= new Wine();

        myWine2.name="Blandy's Vintage Bual";
        myWine2.sort="desert";
        myWine2.year=1972;

        System.out.println(myWine.name+ myWine.year + myWine.sort);
        System.out.println(myWine.name+ myWine.year + myWine.sort);
        System.out.println(myWine.name+ myWine.year + myWine.sort);
    }

}