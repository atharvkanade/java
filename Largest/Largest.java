public class Largest {

    public static void main(String[] args) {
        int[] numArray = { 85, 44, 50, 125, 1, 89 };
        int largest = numArray[0];

        for (int num: numArray) {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %d", largest);
    }
}
