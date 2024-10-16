//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] grades = {29,37,38,41,84,63};
        int[] numbers = {4,8,17,13,16};
        int[] keyboards = {40, 35, 70, 15, 45};
        int[] USB = {20, 15, 40, 15};
        int budget = 60;
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};


        Grades.nichtAusreichendeNoten(grades);
        Grades.durchsnitt(grades);
        Grades.abrundung(grades);
        Grades.maximalAbgerundeteteNote(grades);

        Zahlen.maxi(numbers);
        Zahlen.mini(numbers);
        Zahlen.minSum(numbers);
        Zahlen.maxSum(numbers);

        Markus.billingTastatur(keyboards);
        Markus.teuerGerat(keyboards, USB);
        Markus.teuerUSB(USB, budget);
        Markus.maxAusgebe(keyboards, USB, budget);

        int[] sum = ZahlenArrays.addition(num1, num2);
        System.out.println("Sum: " + Arrays.toString(sum));

        int[] difference = ZahlenArrays.subtraction(num1, num2);
        System.out.println("Difference: " + Arrays.toString(difference));

        int[] product = ZahlenArrays.multiplycation(num1, 3);
        System.out.println("Product: " + Arrays.toString(product));

        int[] division= ZahlenArrays.division(num1, 2);
        System.out.println("Division: " + Arrays.toString(division));
    }
}