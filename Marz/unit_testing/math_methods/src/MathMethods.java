public class MathMethods {

    // Переменные они же поля класса не создаються
    // Конструтор не нужен
    // в класссе будут только его методы MathMethod.имяМетода()
    //


    // Проверка что число простое
    public boolean isPrimeNumber(int number) throws IncorrectNumberException {
        // перебираем 2,3,4,5....., number - 1 b проверяем делится ли оно без осттаткка
        // если хоть раз разделилось без остатка это не простое число.
        // иначе это простое число
        if (number == 0 || number == 1 || number == -1){
            throw new IncorrectNumberException();
        }

        // boolean isPrime = true;

        for (int i = 2; i *i <= number; i++) {
            if (number % i == 0) {
                return false;  // значит нашелся делитель и число не простое
            }

        }





        // Действия n! = 1*2*3...*n, 5! = 1*2*3*4*5 = 120;


        return true;
    }
    // Проверка что число четное

    public boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        }else return false;
    }
}
