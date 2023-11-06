import java.text.NumberFormat;

public class practice {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1259545.453);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(.86);
        System.out.println(result2);
    }
}
