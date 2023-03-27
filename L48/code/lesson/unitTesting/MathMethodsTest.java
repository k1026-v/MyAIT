import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;

public class MathMethodsTest {

    MathMethods mathMethods; // подключили тестируемый класс

    @BeforeEach
    void setUp() {
        mathMethods = new MathMethods(); // создаем экземпляр тестируемого класса перед каждым тестом
    }
    @Test
    @DisplayName("Тестируем метод isPrime")
    void testIsPrime() {
        assertTrue(mathMethods.isPrimeNumber(13)); // ожидаю true при числе 13
        assertFalse(mathMethods.isPrimeNumber(121)); // ожидаю false при числе 121
        assertTrue(mathMethods.isPrimeNumber(31));
        assertFalse(mathMethods.isPrimeNumber(45));
    }

    @Test
    @DisplayName("Тестируем метод isEven")
    void isEven (){
        assertTrue(mathMethods.isEven(4));
        assertTrue(mathMethods.isEven(24));
        assertFalse(mathMethods.isEven(11));
        assertFalse(mathMethods.isEven(121));
    }


}