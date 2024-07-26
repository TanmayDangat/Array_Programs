// Count the number of elements strictly greater than e
import java.util.*;

class StrictlyGreater{
    public int Greater(){
        int count = 0;
        
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
        
        System.out.print("Enter the element : ");
        int e = sc.nextInt();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > e){
                count++;
            }
        }
        return count;
    }
}

public class Main{
    public static void main(String args[]){
        StrictlyGreater sg = new StrictlyGreater();
        System.out.println(sg.Greater());
    }
}