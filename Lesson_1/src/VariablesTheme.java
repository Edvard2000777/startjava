import java.io.File;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.ВЫВОД ASCII-ГРАФИКИ");
        // Первая часть графики
        System.out.println("                     /\\");
        System.out.println("   J    a  v     v  /  \\");
        System.out.println("   J   a a  v   v  /_( )\\");
        System.out.println("J  J  aaaaa  V V  /      \\");
        System.out.println(" JJ  a     a  V  /___/\\___\\");
        String text = """
                
                         /\\
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """;
        System.out.println(text);

        System.out.println("\n2.РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println("Метод c  использованием float");

        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountRate = 0.11f;

        float totalPrice = penPrice + bookPrice;
        float discountAmount = totalPrice * discountRate;

        System.out.println("Стоимость без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Стоимость со скидкой: " + (totalPrice - discountAmount));
        System.out.println("\nМетод с использованием BigDecimal");

        BigDecimal penPrice1 = BigDecimal.valueOf(105.5);
        BigDecimal bookPrice1 = BigDecimal.valueOf(235.23);
        BigDecimal discountRate1 = BigDecimal.valueOf(0.11);

        BigDecimal totalPrice1 = penPrice1.add(bookPrice1);
        BigDecimal discountAmount1 = totalPrice1.multiply(discountRate1);
        BigDecimal discountedPrice = totalPrice1.subtract(discountAmount1);

        System.out.println("Стоимость без скидки: " + totalPrice1);
        System.out.println("Сумма скидки: " + discountAmount1);
        System.out.println("Стоимость со скидкой: " + discountedPrice);
        System.out.println("\n3.ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        int t1 = 2;
        int t2 = 5;
        System.out.println("Исходные значения: A1 = " + t1 + ", B1 = " + t2);
        // Метод: с использованием третьей переменной
        int a1 = t1;
        int b1 = t2;

        int temp = a1;
        a1 = b1;
        b1 = temp;

        System.out.println("\nМетод: третья переменная");
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        // Метод: арифметический
        int x1 = t1;
        int y1 = t2;
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println("Метод: арифметический");
        System.out.println("Результат: A1 = " + x1 + ", B1 = " + y1);

        // Метод: побитовый XOR
        int x2 = t1;
        int y2 = t2;
        x2 = x2 ^ y2;
        y2 = y2 ^ x2;
        x2 = x2 ^ y2;
        System.out.println("Метод: побитовый");
        System.out.println("Результат: A1 = " + x2 + ", B1 = " + y2);

        System.out.println("\n4.ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

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

        System.out.println("\n5.АНАЛИЗ КОДА ТОВАРА");
        int cod = 123;
        int codT = cod / 100;
        System.out.println("Код товара: " + codT);
        System.out.println("  категория товара - " + codT);
        int podCat = (cod % 100 % 100) / 10;
        System.out.println("  подкатегория - " + podCat);
        int type = cod % 100 % 100 % 10;
        System.out.println("  тип упаковки - " + type);
        System.out.println("Контрольная сумма = " + codT + podCat + type);
        System.out.println("Проверочный код = " + codT * podCat * type);

        System.out.println("\n6.ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");

        // Byte: Температура
        byte temperature = Byte.MAX_VALUE;
        System.out.println(
                "[Температура, °C]:\n" +
                        "  Исходное: " + temperature + "\n" +
                        "  +1: " + (byte) (temperature + 1) + "\n" +
                        "  -1: " + (byte) ((byte) (temperature + 1) - 1) + "\n"
        );

        // Short: Давление
        short pressure = Short.MAX_VALUE;
        System.out.println(
                "[Давление, мм рт. ст.]:\n" +
                        "  Исходное: " + pressure + "\n" +
                        "  +1: " + (short) (pressure + 1) + "\n" +
                        "  -1: " + (short) ((short) (pressure + 1) - 1) + "\n"
        );

        // Char: Код состояния системы
        char systemCode = Character.MAX_VALUE;
        System.out.println(
                "[Код состояния системы, ед.]:\n" +
                        "  Исходное: " + (int) systemCode + "\n" +
                        "  +1: " + (int) (char) (systemCode + 1) + "\n" +
                        "  -1: " + (int) (char) ((char) (systemCode + 1) - 1) + "\n"
        );

        // Int: Пройденное расстояние
        int distance = Integer.MAX_VALUE;
        System.out.println(
                "[Пройденное расстояние, м]:\n" +
                        "  Исходное: " + distance + "\n" +
                        "  +1: " + (distance + 1) + "\n" +
                        "  -1: " + ((distance + 1) - 1) + "\n"
        );

        // Long: Время с момента старта
        long timeElapsed = Long.MAX_VALUE;
        System.out.println(
                "[Время с момента старта, мс]:\n" +
                        "  Исходное: " + timeElapsed + "\n" +
                        "  +1: " + (timeElapsed + 1) + "\n" +
                        "  -1: " + (timeElapsed + 1 - 1) + "\n"
        );

        System.out.println("\n7.ВЫВОД ПАРАМЕТРОВ JVM И ОС");
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
        String fileSeparator = File.separator;
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
                \nСистемный диск:""" + osVersion + """
                \nВерсия ОС:""" + javaVersion + """
                \nВерсия Java:""" + fileSeparator);

        System.out.printf("""
                Характеристики JVM:
                -------------------
                Доступное число ядер: %d
                Выделенная память (МБ): %.1f
                Свободная память (МБ): %.1f
                Используемая память (МБ): %.1f
                Максимально доступная память (МБ): %.1f
                """, cores, totalMb, freeMb, usedMb, maxMb);
        System.out.println("\n8.ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
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

