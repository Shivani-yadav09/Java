import java .util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Target: ");
        int target=sc.nextInt();
        int result=FindElement(arr,target);
        if(result != -1){
        System.out.println("Element: "+result);
        }
        else{
            System.out.println("Element not found.");
        }

    }
    static int FindElement(int[] arr,int target){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
                
            }
        }
        return -1;
    
    }
}
