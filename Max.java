
public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,45,6};
        //System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
        // Scanner sc = new Scanner(System.in);

        // // Input array size
        // System.out.print("Enter the size of the array: ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // // Input array elements
        // System.out.println("Enter " + n + " elements:");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // // Call the function
        // int max = max(arr);

        // // Display the result
        // System.out.println("Maximum element = " + max);

        // sc.close();
    }
    static int maxRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for(int i=0;i<=end;i++){
            if(arr[i]> maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;

    }
}
