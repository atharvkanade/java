public class Average {

    public static void main(String[] args) {
        double[] numArray = { 456.3, 678.5, -485.6, 260.34, 383.0, 152.6 };
        double sum = 0.0;
        for (double num: numArray) {
           sum += num;
        }
        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
