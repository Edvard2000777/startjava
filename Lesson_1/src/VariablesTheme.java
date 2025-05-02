public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.ВЫВОД ASCII-ГРАФИКИ");
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
    }
}
