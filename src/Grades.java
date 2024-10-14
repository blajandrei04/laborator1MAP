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
    public static void durchsnitt(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double)sum / grades.length;
        System.out.printf("Durchsnittswert:" + average);
        System.out.println();
    }
    public static void abrundung(int[] grades) {
        System.out.print("Abgerundete Note: ");
        for (int grade : grades) {
            if (grade >= 38) {
                int round = ((grade / 5) + 1) * 5;
                if (round - grade < 3) {
                    grade = round;
                }
            }
            System.out.print(grade + " ");
        }
        System.out.println();
    }
    public static void maximalAbgerundeteteNote(int[] grades) {
        int maxGrade = 0;
        for (int grade : grades) {
            if (grade >= 38) {
                int round = ((grade / 5) + 1) * 5;
                if (round - grade < 3) {
                    grade = round;
                }
            }
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        System.out.println("Maximal abgerundete Note: " + maxGrade);

    }
}
