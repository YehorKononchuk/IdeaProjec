import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;

/*
    **Алгоритм проведения Unit тестов**
            1. Выбрать/создать директорию для проведения Unit-тестирования (обычно - в директории где
            находится тестируемый класс и его методы)
2. Создать в этой директории новый класс (java-файл) с наименованием ИмяКлассаTest
3. Выполнить в этот Класс (файл) импорт библиотек:
            import org.junit.jupiter.api.Assertions;
   import org.junit.jupiter.api.BeforeEach;
   import org.junit.jupiter.api.Test;
4. Подключаем тестируемый класс и его методы строкой вида:
    ИмяКласса имяКласса;
5. Директива @BeforeEach
    void setUp(){
        Имя класса = new ИмяKласса(); // создаем экземпляр тестируемого класса перед каждым тестом
    }
6. Директивы
    @Test
    @DisplayName("Описать что мы тестируем")
    создаь метод, вызывающий assertEquals (нужное значение, вызов тестируемого метода , "Сообщение(пояснение) о ...")
    Пример:
    void testMultiPly(){
        assertEquals(20,calculator.multiply(4,5),"4*5 should be 20");
    }
7. Запустить тест

   */



public class MathMethodsTest {

    MathMethods mathMethods;

    @BeforeEach
    void setUp(){
        mathMethods = new MathMethods(); // создаем экземпляр тест класса перел каждым тестом

    }

    @Test
    @DisplayName("Тестируем метод isPrime")
    void testIsPrime() throws IncorrectNumberException {
        assertTrue(mathMethods.isPrimeNumber(13));
        assertFalse(mathMethods.isPrimeNumber(121));
        assertTrue(mathMethods.isPrimeNumber(31));
        assertFalse(mathMethods.isPrimeNumber(45));



    }



}
