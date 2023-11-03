public class string {
    public static void main(String[] args) {
        String message = new String("hello world :");

        System.out.println(message.endsWith(":"));
        System.out.println(message.indexOf("l", 0));
        System.out.println(message.replace("l", "b"));
        System.out.println(message.toUpperCase());

    }
}