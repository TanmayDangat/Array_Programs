// Smallest and largest element in the array
import java.util.*;

class SmallestAndLargest{
    public int [] SmallAndLarge(){
        
        System.out.print("Enter array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Enter array elements : ");
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("New Array : ");
        int [] ans = {arr[0], arr[arr.length-1]};
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        return ans;
    }
}

public class Main{
    public static void main(String args[]){
        SmallestAndLargest sal = new SmallestAndLargest();
        sal.SmallAndLarge();
    }
}