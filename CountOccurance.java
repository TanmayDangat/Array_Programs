// Count the occurance
import java.util.*;

class CountOccurance{
    public int Occurance(){
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
        
        System.out.print("Enter the element you want to count : ");
        int e = sc.nextInt();
        
        System.out.print("Occurance : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == e){
                count += 1;
            }
        }
        return count;
    }
}

public class Main{
    public static void main(String args[]){
        CountOccurance co = new CountOccurance();
        System.out.println(co.Occurance());
    }
}
