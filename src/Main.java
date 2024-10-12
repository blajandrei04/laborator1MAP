//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        int[] grades = {29,37,38,41,84,63};
        int[] numbers = {4,8,17,13,16};
        Grades.nichtAusreichendeNoten(grades);
        Grades.calculateAverage(grades);
        Grades.abrundung(grades);
        Grades.maximalAbgerundeteteNote(grades);
        Zahlen.maxi(numbers);
        Zahlen.mini(numbers);
        Zahlen.minSum(numbers);
        Zahlen.maxSum(numbers);

    }
}