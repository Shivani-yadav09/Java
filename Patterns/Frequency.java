public class Frequency {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40, 20};

        int search = 10;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                count++;
            }
        }

        System.out.println("Frequency of " + search + " = " + count);
    }
}