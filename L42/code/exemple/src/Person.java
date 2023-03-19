public class Person {

    String name;
    protected int age;
    public String adress;
    private String phone;

    public Person(String name, int age, String adress, String phone) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Name: %s \n",name);
    }

    void displayAge(){
        System.out.printf("Age:%s \n",age);
    }

    void displayAdress(){
        System.out.printf("Adress:%s \n",adress);
    }

    protected void displayPhone(){
        System.out.printf("Phone:%s \n",phone);
    }
}
