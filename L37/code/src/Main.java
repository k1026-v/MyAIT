public class Main {
    public static void main(String[] args) {

        System.out.println("Работник и зарплата.");
        // Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
        // уметь отправлять им письма по e-mail с информацией об их зарплате

        // Так создать экземплярр Employee не получается
//        Employee emp1 = new Employee("Иванов Петр","ivanov_p@mail.com", 101);
//        emp1.mailPaySlip();

        // Содаем работника с зарплатой
        Salary s1 = new Salary("Иванов Петр", "ivanov_p@mail.com", 101, 60000);
        Salary s2 = new Salary("Петров Алексей", "petrov_a@mail.com", 102, 48000);

//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println("Вызываем метод mailPaySlip");

        s1.mailPaySlip();
        System.out.println();
        s2.mailPaySlip();

        s2.setSalary(54000); // установили новую зарплату
        System.out.println();
        s2.mailPaySlip(); // отправили уведомление


        Address adr1= new Address("Puhlmann I.", "pul@gmail.com", 023, "Ettaler str.16");
        Address adr2= new Address("Rothental S..", "roth@gmail.com", 025, "Blumen str.16");
        System.out.println();
        System.out.println("Address of employee "+ adr1.getName()+adr1.toString());
        System.out.println("Address of employee "+ adr2.getName()+adr2.toString());

    }
}