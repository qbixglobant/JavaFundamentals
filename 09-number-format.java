import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String resultCurrency = currency.format(123456.891);

        System.out.println("Currency: " + resultCurrency);

        System.out.println("=".repeat(40));

        NumberFormat percentage = NumberFormat.getPercentInstance();

        String resultPercentage = percentage.format(0.18);

        System.out.println("Percentage: " + resultPercentage);

        System.out.println("=".repeat(40));

        String resultPercentage2 = NumberFormat.getPercentInstance().format(0.25);

        System.out.println("Percentage: " + resultPercentage2);
    }

}
