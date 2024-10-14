public class ZahlenArrays {
    public static int[] addition(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        return result;
    }
    public static int[] subtraction(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];
        int carrry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - carrry;
            if (diff < 0) {
                diff += 10;
                carrry = 1;
            } else {
                carrry = 0;
            }
            result[i] = diff;
        }

        return result;
    }
    public static int[] multiplycation(int[] num, int digit) {
        int n = num.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;

        return result;
    }
    public static int[] division(int[] num, int divisor) {
        int n = num.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = 0; i < n; i++) {
            int curr = carry * 10 + num[i];
            result[i] = curr / divisor;
            carry = curr % divisor;
        }
        return result;
    }

}
