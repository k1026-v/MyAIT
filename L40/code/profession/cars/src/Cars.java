public class Cars {
    int age;
    String usege;
    int speed;

    public Cars(int age, String usege, int speed) {
        this.age = age;
        this.usege = usege;
        this.speed = speed;
    }

    public void go(){
        System.out.println("Go by way");
        this.speed= speed;
    }

    public void stop(){
        System.out.println("Stoped");
        this.speed= 0;
    }

    public void speedUp(){
        System.out.println("Speed up");
        this.speed= speed +10;
        System.out.println("speed = "+ this.speed);
    }
    public void speedDown(){
        System.out.println("Speed down");
        this.speed= speed -10;
        System.out.println("speed = "+ this.speed);
    }

}
