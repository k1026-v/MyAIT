public abstract class Dancer {

    String name;
    Integer age;

    String sex;

    public void dance(){
        System.out.println(toString()+"dancing");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Dancer(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
