public abstract class Employee {
    private String name; // это для имени сотрудника, оно закрыто от прямого доступа из других классов
    private String email; // это для email сотрудника, оно закрыто от прямого доступа из других классов
    private int ID_num; // это внутренний номер

    public Employee(String name, String email, int ID_num) {
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
    }
    // метод для отправки информации
    public void mailPaySlip() {
        System.out.println("Это метод класса Eployee");
        System.out.println("Уважаемый " + this.name + ", направляем информацию о зарплате на адрес " + this.email);
    }

    // этот метод переопределяет стандартный toString
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ID_num=" + ID_num +
                '}';
    }

    // это геттер
    public String getName() {
        return name;
    }

    // это геттер
    public String getEmail() {
        return email;
    }

    // это геттер
    public int getID_num() {
        return ID_num;
    }
}

