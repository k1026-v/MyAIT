public class Main {
    public static void main(String[] args) {

        /*
            Создайте класс Phone, который содержит переменные number, brand и model.
            Создайте три экземпляра этого класса.
                Выведите на консоль значения их переменных методом toString.
                Добавить в класс Phone метод:receiveCall, имеет один параметр –имя звонящего.
            Выводит на консоль сообщение “Звонит name”.
            Задайте метод getNumber –возвращает номер телефона.
                Вызвать этот метод для каждого из объектов.
            Добавить конструктор в класс Phone, который принимает на вход три параметра
            для инициализации переменных класса -number, brand и model.
            Добавить в класс setter и getter.*/

       /*Phone myPhone=new Phone();

        myPhone.phoneNumber="+498435245";
        myPhone.brand="Samsung";
        myPhone.model="A-52";

        Phone myPhone1=new Phone();

        myPhone1.phoneNumber="+380660101026";
        myPhone1.brand="Samsung";
        myPhone1.model="A-52A";

        Phone myPhone2=new Phone();

        myPhone2.phoneNumber="++380660101025";
        myPhone2.brand="Samsung";
        myPhone2.model="A-52A";

        myPhone.toString();
        myPhone1.toString();
        myPhone2.toString();

        myPhone.recievCall("Mama");
        myPhone1.recievCall("Papa");

        System.out.println(myPhone1.getPhoneNumber());

       Books myBook= new Books();
       myBook.name=" Sapiens: A Graphic History";
       myBook.author="Yuval Noah Harari's";
       myBook.publicationYear=2021;

       Books myBook1=new Books();
       myBook1.name="The Real Book, Volume I";
       myBook1.author="Hal Leonard";
       myBook1.publicationYear=2020;

       Books myBook2=new Books();
       myBook2.name="Mythology: Timeless Tales of Gods and Heroes";
       myBook2.author="Edith Hamilton";
       myBook2.publicationYear=2018;

        System.out.println("Book 1:"+myBook.toString());
        System.out.println("Book 2:"+myBook1.toString());
        System.out.println("Book 3:"+myBook2.toString());

        myBook.readNow("mama");
        myBook1.readNow("papa");
        myBook2.readNow("Tom");*/

      Books myBook=new Books(" Sapiens: A Graphic History", "Yuval Noah Harari's", 2021);
      Books myBook1=new Books("The Real Book, Volume I", "Hal Leonard", 2020);
      Books myBook2=new Books("Mythology: Timeless Tales of Gods and Heroes", "Edith Hamilton", 2018);

        System.out.println(myBook);
        System.out.println(myBook1);
        System.out.println(myBook2);
    }
}