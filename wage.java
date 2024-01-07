public class practice {
    public static void main(String[] args) {

        int basesalary = 20000;
        int extrahours = 10;
        int hourlyrate = 100;

        int wage = calculatewage(basesalary, extrahours, hourlyrate);
        System.out.println(wage);
    }

    public static int calculatewage(
            int basesalary,
            int extrahours,
            int hourlyrate) {
        return basesalary + (hourlyrate * extrahours);

    }

}
