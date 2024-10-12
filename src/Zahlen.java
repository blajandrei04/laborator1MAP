public class Zahlen {
    public static void maxi(int [] numbers){
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        System.out.println("Maximal:" + max);
    }
    public static void mini(int [] numbers){
        int min = numbers[0];
        for (int number : numbers) {
            if(number < min)
                min = number;
        }
        System.out.println("Minimal:" + min);
    }
    public static void maxSum(int [] numbers){
        int min = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
        }
        int rez = sum-min;
        System.out.println("Maximal sum:" + rez);

    }
    public static void minSum(int [] numbers){
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        int rez = sum-max;
        System.out.println("Minimal sum:" + rez);
    }
    akcnsaksa
}
