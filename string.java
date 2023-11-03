public class string {
    public static void main(String[] args) {
        String message = new String("hello world :");

        System.out.println(message.endsWith(":")); //To find string end with 
        System.out.println(message.indexOf("l", 0)); //To find index of character
        System.out.println(message.replace("l", "b"));//To replace char
        System.out.println(message.toUpperCase());

    }
}
