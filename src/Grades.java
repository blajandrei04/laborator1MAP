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
}
