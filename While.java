import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("quit")) {
            System.out.println("Input : ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }

    }
}
