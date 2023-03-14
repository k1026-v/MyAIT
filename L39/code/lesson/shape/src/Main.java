public class Main {
    public static void main(String[] args) {

       Circus c1= new Circus("circus", 10.00);
       double s1=c1.square();
        System.out.println("Square of circus equal "+ s1);

        Triangel t1=new Triangel("t1",3.00, 4.00);
        double s2=t1.square();
        System.out.println("Square of triangle equal "+ s2);

        Rectangle r1= new Rectangle("r1", 4, 6);
        double s3= r1.square();
        System.out.println("Square of rectangle equal "+ s3);

        Trapeziod tr1=new Trapeziod("tr1", 6, 10, 4);
        double s4= tr1.square();
        System.out.println("Square of trapeziod equal "+ s4);
    }
}