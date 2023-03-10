public class Salary extends Employee { // extends - это "расширить", "унаследовать"
    private double salary;

    // конструктор для класса Salary
    public Salary(String name, String email, int ID_num, double salary) {
        super(name, email, ID_num); // вытащили поля из родительского класса Employee
        this.salary = salary; // добавили к ним зарплату
    }

    public void mailPaySlip() {
        // System.out.println("Это метод класса Salary");
        System.out.println("Уважаемый " + getName()  + ", направляем информацию о зарплате на адрес " + getEmail() );
        System.out.println("Ваша годовая зарплата  " + getSalary());
        System.out.println("Ваша ежемесячная зарплата  " + getSalary()/12);
    }

    // это геттер по зарплате
    public double getSalary() {
        return salary;
    }

    // сеттер для назначения зарплаты
    public void setSalary(double newSalary) { // передаем в метод значение newSalary
        // this.salary = salary;
        if (newSalary > 0) { // если зарплата положительная, то ее назначаем
            salary = newSalary;
        }
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}






