// Array descending order
import java.util.*;

class ArrayAscendingOrder{
    public int [] Ascending(){
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
        
        System.out.print("Ascending order : ");
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        return arr;
    }
}

public class Main{
    public static void main(String args[]){
        ArrayAscendingOrder asc = new ArrayAscendingOrder();
        asc.Ascending();
    }
}