public class Factorial {
    public static void main(String[] args) {
        int num = 20;
        long fact = 1;
        for(int i = 1; i <= num; ++i)
        {  
            fact *= i;
        }
        System.out.printf("Factorial of the given number %d  is = %d", num, fact);
    }
}
