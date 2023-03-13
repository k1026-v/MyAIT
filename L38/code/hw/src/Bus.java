import java.util.Scanner;

public class Bus {
    //Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест,
    // скорость на маршруте (не может быть больше 60 км/ч), стоимость проезда 2 евро.
    // В классе Bus создайте метод setDriver, который принимает имя драйвера и назначает
    // его водителем автобуса. Сформируйте информцию об автобусе в следующем виде:
    // Информация об автобусе: Номер маршрутв : __ Вместимость: ___ кресел Водитель: _____
    // Скорость на маршруте: _____ Создать класс Driver с атрибутами: имя водителя, возраст водителя
    // (должен быть старшше 21 года и не старше 65 лет). Создать класс Passenger с атрибутами:
    // имя, возраст (должен быть старше 10 лет). Среднестатистическая заполняемость автобуса
    // составляет 60% от его вместимости. Автобус за день совершает 5 рейсов по маршруту.
    // Рассчитайте объем дневной выручки от работы автобуса.

    Integer busLine;
    String driver;
    Integer capacity;
    Integer speed;
    Integer cost;

    public Bus(Integer busLine, String driver, Integer capacity, Integer speed, Integer cost) {
        this.busLine = busLine;
        this.driver = driver;
        this.capacity = 36;
        if( speed>60){
            System.out.println("Overspeeding");

        }else {
            this.speed = speed;};

        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busLine=" + busLine +
                ", driver='" + driver + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                ", cost=" + cost +
                '}';
    }

    public String setDriver(String name){

        this.driver = name;
        return name;
    }
}
