public class Voiter {
    String name;
    String ID_num;
    int age;

    public Voiter(String name, String ID_num, int age) {
        this.name = name;
        this.ID_num = ID_num;
        if (age>=16) {
            this.age = age;
        } else {
            this.age = age;
            System.out.println("This voiter can not voite.Too young");
        }
    }

    @Override
    public String toString() {
        return "Voiter{" +
                "name='" + name + '\'' +
                ", ID_num='" + ID_num + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getID_num() {
        return ID_num;
    }

    public int getAge() {
        return age;
    }
}
