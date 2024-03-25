public class Armstrong {
    public static void main(String[] args) {
        int number = 731, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println("The given "number + " is an Armstrong number.");
        else
            System.out.println("The given"number + " is not an Armstrong number.");
    }
