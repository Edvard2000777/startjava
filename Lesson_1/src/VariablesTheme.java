import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.ВЫВОД ASCII-ГРАФИКИ");
        // Первая часть графики
        System.out.println("""
                
                                     /\\
                   J    a  v     v  /  \\
                   J   a a  v   v  /_( )\\
                J  J  aaaaa  V V  /      \\
                 JJ  a     a  V  /___/\\___\\
                """);
        String text = """
                
                         /\\
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """;
        System.out.println(text);
        System.out.println("2.РАСЧЕТ СТОИМОСТИ ТОВАРА");
        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountRate = 0.11f;

        float totalPrice = penPrice + bookPrice;
        float discountAmount = totalPrice * discountRate;

        System.out.println("Стоимость без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Стоимость со скидкой: " + (totalPrice - discountAmount));
        System.out.println("3.РАСЧЕТ СТОИМОСТИ ТОВАРА");
        int t1 = 2;
        int t2 = 5;
        System.out.println("Исходные значения: A1 = " + t1 + ", B1 = " + t2);

        System.out.println("4.ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        // Метод: с использованием третьей переменной
        int x3 = t1;
        int y4 = t2;
        int temp = x3;
        x3 = y4;
        y4 = temp;
        System.out.println("\nМетод: третья переменная");
        System.out.println("Результат: A1 = " + x3 + ", B1 = " + y4);

        // Метод: арифметический
        int x1 = t1;
        int y1 = t2;
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println("\nМетод: арифметический");
        System.out.println("Результат: A1 = " + x1 + ", B1 = " + y1);

        // Метод: побитовый XOR
        int x2 = t1;
        int y2 = t2;
        x2 = x2 ^ y2;
        y2 = y2 ^ x2;
        x2 = x2 ^ y2;
        System.out.println("\nМетод: побитовый");
        System.out.println("Результат: A1 = " + x2 + ", B1 = " + y2);

        System.out.println("5.ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

        int c1 = 1055;
        int c2 = 1088;
        int c3 = 1080;
        int c4 = 1074;
        int c5 = 1077;
        int c6 = 1090;

        System.out.printf("%-6d%-6d%-6d%-6d%-6d%-6d%n", c1, c2, c3, c4, c5, c6);

        System.out.printf("%-6c%-6c%-6c%-6c%-6c%-6c%n",
                (char) c1, (char) c2, (char) c3,
                (char) c4, (char) c5, (char) c6);

        System.out.println("6.АНАЛИЗ КОДА ТОВАРА");
        int cod = 123;
        int p1 = cod / 100;
        System.out.println("Код товара: " + p1);
        System.out.println("  категория товара - " + p1);
        int p2 = (cod % 100 % 100) / 10;
        System.out.println("  подкатегория - " + p2);
        int p3 = cod % 100 % 100 % 10;
        System.out.println("  тип упаковки - " + p3);
        System.out.println("Контрольная сумма = " + p1 + p2 + p3);
        System.out.println("Проверочный код = " + p1 * p2 * p3);

        System.out.println("7.ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");

        // Byte: Температура
        byte temperature = Byte.MAX_VALUE;
        System.out.println("""
                [Температура, °C]:
                  Исходное:""" + temperature + """
                +1:""" + (byte) (temperature + 1) + """
                -1:""" + (byte) ((byte) (temperature + 1) - 1) + """
                """);

        // Short: Давление
        short pressure = Short.MAX_VALUE;
        System.out.println("""
                [Давление, мм рт. ст.]:
                  Исходное:""" + pressure + """
                +1:""" + (short) (pressure + 1) + """
                -1:""" + (short) ((short) (pressure + 1) - 1) + """
                """);

        // Char: Код состояния системы
        char systemCode = Character.MAX_VALUE;
        System.out.println("""
                [Код состояния системы, ед.]:
                  Исходное:""" + (int) systemCode + """
                +1:""" + (int) (char) (systemCode + 1) + """
                -1:""" + (int) (char) ((char) (systemCode + 1) - 1) + """
                """);

        // Int: Пройденное расстояние
        int distance = Integer.MAX_VALUE;
        System.out.println("""
                [Пройденное расстояние, м]:
                  Исходное:""" + distance + """
                +1:""" + distance + 1 + """
                -1:""" + ((distance + 1) - 1) + """
                """
        );

        // Long: Время с момента старта
        long timeElapsed = Long.MAX_VALUE;
        System.out.println("""
                [Время с момента старта, мс]:
                  Исходное:""" + timeElapsed + """
                +1:""" + timeElapsed + 1 + """
                -1:""" + (timeElapsed + 1 - 1) + """
                """);
        System.out.println("8.ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        Runtime runtime = Runtime.getRuntime();

        int availableProcessors = runtime.availableProcessors();
        // Выделенная память (байты)
        long totalMemory = runtime.totalMemory();
        // Свободная память (байты)
        long freeMemory = runtime.freeMemory();
        // Максимально доступная память (байты)
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Доступное число ядер: " + availableProcessors);
        System.out.println("Выделенная память (МБ): " + bytesToMegabytes(totalMemory));
        System.out.println("Свободная память (МБ): " + bytesToMegabytes(freeMemory));
        System.out.println("Используемая память (МБ): " + bytesToMegabytes(usedMemory));
        System.out.println("Максимально доступная для выделения память (МБ): " + bytesToMegabytes(maxMemory));

        // Сведения об ОС и Java
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        // переменная окружения Windows, для Linux/macOS вернёт null
        String systemDrive = System.getenv("SystemDrive");

        // Сведения о JVM
        int cores = runtime.availableProcessors();
        double totalMb = totalMemory / 1024.0 / 1024;
        double freeMb = freeMemory / 1024.0 / 1024;
        double usedMb = usedMemory / 1024.0 / 1024;
        double maxMb = maxMemory / 1024.0 / 1024;

        // Вывод
        System.out.println("""
                Характеристики ОС:
                -----------------
                Имя ОС:""" + (systemDrive != null ? systemDrive : "недоступно") + """
                Системный диск:""" + osVersion + """
                Версия ОС:""" + javaVersion + """
                Версия Java:""" + fileSeparator);
        System.out.printf("""
                Характеристики JVM:
                -------------------
                Доступное число ядер: %d
                Выделенная память (МБ): %.1f
                Свободная память (МБ): %.1f
                Используемая память (МБ): %.1f
                Максимально доступная память (МБ): %.1f
                """, cores, totalMb, freeMb, usedMb, maxMb);

        System.out.println("9.ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        // Время окончания
        long endNano = System.nanoTime();
        LocalTime endTime = LocalTime.now();
        // Формат времени
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        // Время старта
        LocalTime startTime = LocalTime.now();
        long startNano = System.nanoTime();

        double durationSec = (endNano - startNano) / 1_000_000_000.0;

        // Вывод времени
        System.out.println();
        System.out.printf("Старт проверки: %s%n", startTime.format(timeFormatter));
        System.out.printf("Финиш проверки: %s%n", endTime.format(timeFormatter));
        System.out.printf("Время работы:   %.3f сек%n", durationSec);
    }

    static long bytesToMegabytes(long bytes) {
        return bytes / (1024 * 1024);
    }
}

