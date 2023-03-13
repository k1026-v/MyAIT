public class Main {
    public static void main(String[] args) {

       Circus c1= new Circus("circus", 10.00);
       double s1=c1.square();
        System.out.println("Square equal "+ s1);

        Triangel t1=new Triangel("t1",3.00, 4.00);
        double s2=t1.square();
        System.out.println("Square equal "+ s2);
    }
}