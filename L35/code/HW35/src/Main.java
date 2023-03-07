public class Main {
    public static void main(String[] args) {


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

        System.out.println(myWine.name+ " "+ myWine.year+ " " + myWine.sort);
        System.out.println(myWine1.name+ " "+ myWine1.year+ " " + myWine1.sort);
        System.out.println(myWine2.name+ " "+ myWine2.year+ " " + myWine2.sort);

        System.out.println(myWine.toString());

        myWine.onStock(4);
        myWine1.onStock(13);
        myWine2.onStock(1);


                myWine.getYear();
                myWine1.getYear();
                myWine2.getYear();
    }

}