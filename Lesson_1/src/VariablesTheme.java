import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
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


        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountRate = 0.11f;

        float totalPrice = penPrice + bookPrice;
        float discountAmount = totalPrice * discountRate;

        System.out.println("Стоимость без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Стоимость со скидкой: " +(totalPrice - discountAmount));


    }
}
