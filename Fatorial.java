public class Factorial {
    public static void main(String[] args) {
        int num = 15;
        long fact = 1;
        for(int i = 1; i <= num; ++i)
        {  
            fact *= i;
        }
        System.out.printf("Factorial of number %d = %d", num, fact);
    }
}
