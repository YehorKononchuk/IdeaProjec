package HomeWork;

public class zadacha3 {
    public static void main(String[] args) {
        // Создаем массивы данных о температуре и давлении за каждый день февраля
        double[] temperatures = {-5.2, -4.5, -3.0, -2.7, -2.1, -1.5, -0.5, 0.3, 1.2, 2.1, 3.0, 3.7, 4.5, 5.0, 5.3, 5.6, 6.0, 6.3, 5.8, 4.7, 3.2, 2.0, 0.5, -1.0, -2.5, -3.8, -4.5, -4.9};
        double[] pressures = {755.0, 750.2, 753.4, 753.5, 755.1, 756.3, 756.9, 758.1, 760.0, 761.5, 762.1, 762.3, 763.2, 764.3, 765.1, 766.0, 766.5, 765.9, 766.2, 764.9, 763.3, 761.8, 759.5, 757.2, 754.8, 752.9, 750.7, 747.8};

// Инициализируем переменные для минимальных и максимальных значений температуры и давления
        double minTemperature = temperatures[0];
        double maxTemperature = temperatures[0];
        double minPressure = pressures[0];
        double maxPressure = pressures[0];

// Инициализируем переменные для дат, когда были зафиксированы минимальные и максимальные значения температуры и давления
        int minTemperatureDay = 1;
        int maxTemperatureDay = 1;
        int minPressureDay = 1;
        int maxPressureDay = 1;

// Проходим по всем элементам массивов и находим минимальные и максимальные значения температуры и давления
        for (int i = 1; i < temperatures.length; i++) {
            // Проверяем температуру
            if (temperatures[i] < minTemperature) {
                minTemperature = temperatures[i];
                minTemperatureDay = i + 1;
            }
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
                maxTemperatureDay = i + 1;
            }
            // Проверяем давление
            if (pressures[i] < minPressure) {
                minPressure = pressures[i];
                minPressureDay = i + 1;
            }
            if (pressures[i] > maxPressure) {
                maxPressure = pressures[i];
                maxPressureDay = i + 1;
            }
        }

// Выводим результаты в виде таблицы
        System.out.println("Дата\tТемпература\t\tДавление");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("%d\t\t\t%.1f\t\t\t%.1f", i + 1, temperatures[i],pressures[i]);
            // Добавляем пометку для минимальной температуры
            if (temperatures[i]==minTemperature){
                System.out.println("/t[Мин. температура]");
            }
            // Добавляем пометку для максимальной температуры
            if (temperatures[i] == maxTemperature) {
                System.out.print("\t[Макс. температура]");
            }
            // Добавляем пометку для минимального давления
            if (pressures[i] == minPressure) {
                System.out.print("\t[Мин. давление]");
            }
            // Добавляем пометку для максимального давления
            if (pressures[i] == maxPressure) {
                System.out.print("\t[Макс. давление]");
            }
            System.out.println();
        }

        }
    }

