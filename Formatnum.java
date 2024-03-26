import java.text.NumberFormat;

public class Formatnum {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1245595.453);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(.68);
        System.out.println(result2);
    }
}
