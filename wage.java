public class wage {
    public static void main(String[] args) {

        int basesalary = 300000;
        int extrahours = 12;
        int hourlyrate = 1000;

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
