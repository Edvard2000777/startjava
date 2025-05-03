import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.ВЫВОД ASCII-ГРАФИКИ");
        // Формат времени
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        // Время старта
        LocalTime startTime = LocalTime.now();
        long startNano = System.nanoTime();
        System.out.println("\n" +
                "                     /\\\n" +
                "   J    a  v     v  /  \\\n" +
                "   J   a a  v   v  /_( )\\\n" +
                "J  J  aaaaa  V V  /      \\\n" +
                " JJ  a     a  V  /___/\\___\\\n" +
                "\n");
        String Textblock = "\n" +
                "         /\\            \n" +
                "   J    /  \\  v     v  a\n" +
                "   J   /_( )\\  v   v  a a\n" +
                "J  J  /      \\  V V  aaaaa\n" +
                " JJ  /___/\\___\\  V  a     a\n" +
                "\n";
        System.out.println(Textblock);
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
        int A1 = 2, B1 = 5;
        System.out.println("Исходные значения: A1 = " + A1 + ", B1 = " + B1);

        System.out.println("3.ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        // Метод: с использованием третьей переменной
        int x = A1, y = B1;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Метод: третья переменная");
        System.out.println("Результат: A1 = " + x + ", B1 = " + y);

        // Метод: арифметический
        x = A1;
        y = B1;
        x += y;
        y = x - y;
        x -= y;
        System.out.println("Метод: арифметический");
        System.out.println("Результат: A1 = " + x + ", B1 = " + y);

        // Метод: побитовый XOR
        x = A1;
        y = B1;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("Метод: побитовый");
        System.out.println("Результат: A1 = " + x + ", B1 = " + y);

        System.out.println("4.ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
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

        System.out.println("5.АНАЛИЗ КОДА ТОВАРА");
        int CodTov = 123;
        int p1 = CodTov / 100;
        System.out.println("Код товара: " + p1);
        System.out.println("  категория товара - " + p1);
        int p2 = (CodTov % 100 % 100) / 10;
        System.out.println("  подкатегория - " + p2);
        int p3 = CodTov % 100 % 100 % 10;
        System.out.println("  тип упаковки - " + p3);
        System.out.println("Контрольная сумма = " + p1 + p2 + p3);
        System.out.println("Проверочный код = " + p1 * p2 * p3);

        System.out.println("6.ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");

        // Byte: Температура
        byte temperature = Byte.MAX_VALUE;
        System.out.println("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(
                temperature,
                (byte) (temperature + 1),
                (byte) ((byte) (temperature + 1) - 1)
        ));

        // Short: Давление
        short pressure = Short.MAX_VALUE;
        System.out.println("""
                [Давление, мм рт. ст.]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(
                pressure,
                (short) (pressure + 1),
                (short) ((short) (pressure + 1) - 1)
        ));

        // Char: Код состояния системы
        char systemCode = Character.MAX_VALUE;
        System.out.println("""
                [Код состояния системы, ед.]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(
                (int) systemCode,
                (int) (char) (systemCode + 1),
                (int) (char) ((char) (systemCode + 1) - 1)
        ));

        // Int: Пройденное расстояние
        int distance = Integer.MAX_VALUE;
        System.out.println("""
                [Пройденное расстояние, м]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(
                distance,
                distance + 1,
                (distance + 1) - 1
        ));

        // Long: Время с момента старта
        long timeElapsed = Long.MAX_VALUE;
        System.out.println("""
                [Время с момента старта, мс]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """.formatted(
                timeElapsed,
                timeElapsed + 1,
                (timeElapsed + 1) - 1
        ));

        System.out.println("7.ВЫВОД ПАРАМЕТРОВ JVM И ОС");
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
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String fileSeparator = System.getProperty("file.separator");
        String systemDrive = System.getenv("SystemDrive"); // переменная окружения Windows, для Linux/macOS вернёт null

        // Сведения о JVM
        int cores = runtime.availableProcessors();
        double totalMB = totalMemory / 1024.0 / 1024;
        double freeMB = freeMemory / 1024.0 / 1024;
        double usedMB = usedMemory / 1024.0 / 1024;
        double maxMB = maxMemory / 1024.0 / 1024;

        // Вывод
        System.out.println("""
                Характеристики ОС:
                -----------------
                Системный диск: %s
                Версия ОС: %s
                Версия Java: %s
                """.formatted(systemDrive != null ? systemDrive : "недоступно", osVersion, javaVersion, fileSeparator));

        System.out.printf("""
                Характеристики JVM:
                -------------------
                Доступное число ядер: %d
                Выделенная память (МБ): %.1f
                Свободная память (МБ): %.1f
                Используемая память (МБ): %.1f
                Максимально доступная память (МБ): %.1f
                """, cores, totalMB, freeMB, usedMB, maxMB);

        System.out.println("8.ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        // Время окончания
        long endNano = System.nanoTime();
        LocalTime endTime = LocalTime.now();

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

