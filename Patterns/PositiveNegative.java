public class PositiveNegative {
    public static void main(String[] args) {

        int[] arr = {10, -5, 20, -15, 0, 30, -2};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}