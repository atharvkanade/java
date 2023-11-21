import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the principle amount :");
        int principle = Scanner.nextInt();
        System.out.println("Enter Annual Interest : ");

        float interest = Scanner.nextFloat();
        System.out.println("Enter the time period (in years) :");
        byte period = Scanner.nextByte();

        int p = principle;
       /*12 months
       100 for percentage*/
        
        float i = (interest / 100 / 12);
        int y = (period * 12);
        float x = (float) Math.pow((1 + i), y);

        float mortgage = p * ((i * x) / (x - 1));

        System.out.println("Your mortgage is :" + mortgage);

    }

}
