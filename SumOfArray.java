import java.util.Scanner;

public class SumOfArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=findSum(arr);
        System.out.println("sum="+result);

    }
    static int findSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}