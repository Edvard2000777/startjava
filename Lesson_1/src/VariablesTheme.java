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
        System.out.println("\nМетод: третья переменная");
        System.out.println("Результат: A1 = " + x + ", B1 = " + y);

        // Метод: арифметический
        x = A1;
        y = B1;
        x += y;
        y = x - y;
        x -= y;
        System.out.println("\nМетод: арифметический");
        System.out.println("Результат: A1 = " + x + ", B1 = " + y);

        // Метод: побитовый XOR
        x = A1;
        y = B1;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("\nМетод: побитовый");
        System.out.println("Результат: A1 = " + x + ", B1 = " + y);
    }
}
