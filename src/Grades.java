public class Grades {
    public static void nichtAusreichendeNoten(int[] grades) {
        System.out.print("Nicht ausreichende NOten: ");
        for (int grade : grades) {
            if (grade < 40) {
                System.out.print(grade + " ");
            }
        }
        System.out.println();
    }
    public static void calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.printf("Average grade:" + average);
    }
}
