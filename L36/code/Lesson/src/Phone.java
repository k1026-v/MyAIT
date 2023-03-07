public class Phone {

    String phoneNumber;
    String model;
    String brand;

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + phoneNumber +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String recievCall (String name){
        System.out.println("Call " +name);
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Phone(String phoneNumber, String model, String brand) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.brand = brand;
    }
}
