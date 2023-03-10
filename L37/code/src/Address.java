public class Address extends Employee {
    private String Address;
    public Address(String name, String email, int ID_num, String address) {
        super(name, email, ID_num);
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Address='" + Address + '\'' +
                '}';
    }
}
