class Dog {
    private String name;
    private int age;

    // конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // геттер имени
    public String getDogName() {
        return name;
    }

    // геттер возраста
    public int getDogAge() {
        return age;
    }

    // сравниваем имена
    @Override
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // сравниваем возраст
    @Override
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}