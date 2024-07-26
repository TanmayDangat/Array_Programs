// Check if array is sorted or not
import java.util.*;

class SortedOrNot{
    public boolean Check(){
        boolean b = true;
        
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
        
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
        return b;
    }
}

public class Main{
    public static void main(String args[]){
        SortedOrNot son = new SortedOrNot();
        System.out.println(son.Check());
    }
}