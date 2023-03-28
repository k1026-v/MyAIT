public class MathMethods {

    // переменные (поля) класса не нужны
    // конструктор не нужен
    // в классе будут только его методы MathMethod.имяМетода()

    // - Проверка, что число простое
    public boolean isPrimeNumber(int number) {
        //   перебираем 2, 3, 4, 5, ... , number - 1 b проверяем делится ли number без остатка
        // если хоть раз разделилось без остатка (остаток == 0), но ЭТО НЕ ПРОСТОЕ число
        // иначе - ЭТО ПРОСТОЕ число
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // это значит нашелся делитель и число НЕ ПРОСТОЕ
            }
        }
        return true;
    }

    // - Проверка, что число четное
    public boolean isEven(int number) {

            if (number % 2 == 0) {
                return true;
            } else  return false;
    }

    public boolean isDivBy3 (int number) {

            if (number % 3 == 0) {
                return true;
            } else  return false;
    }

    public boolean isDivBy5 (int number) {

            if (number % 5 == 0) {
                return true;
            } else  return false;
    }





}