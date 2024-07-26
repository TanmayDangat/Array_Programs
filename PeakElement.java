// Find the peak element
import java.util.*;

class Peak{
    public void Check(){
        
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
            if(arr[i+1] > arr[i] && arr[i+1] > arr[i+2]){
                System.out.println(arr[i+1]);
                break;
            }
        }
    }
}

public class Main{
    public static void main(String args[]){
        Peak eon = new Peak();
        eon.Check();
    }
}