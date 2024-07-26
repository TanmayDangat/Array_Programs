// Reverse the array
import java.util.*;

class ArrayReverse{
    
    public int [] Reverse(){
        System.out.print("Enter the length of an array : ");
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
        
        System.out.print("Reversed array : ");
        for(int i = arr.length-1; i >= 0 ;i--){
            System.out.print(arr[i] + " ");
        }

	// for(int i = 0; i < arr.length ;i++){
        //     for(int j = i+1;  j < arr.length; j++){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }
        // }
        
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        return arr;
    }
}

public class Main{
    public static void main(String args[]){
        ArrayReverse ar = new ArrayReverse();
        ar.Reverse();
    }
}