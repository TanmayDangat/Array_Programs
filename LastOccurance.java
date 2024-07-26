// Last occurance of an element e
import java.util.*;

class LastOccurance{
    public int Occurance(){
        int lastIndex = -1;
        
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
        
        System.out.print("Last ocurance index : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == e){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}

public class Main{
    public static void main(String args[]){
        LastOccurance lo = new LastOccurance();
        System.out.println(lo.Occurance());
    }
}