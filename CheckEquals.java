// Check if the arrays are equal or not
import java.util.*;

class EqualOrNot{
    public void Check(){
        
        System.out.print("Enter array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Enter array 1 elements : ");
        int [] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter array 2 elements : ");
        int [] arr2 = new int[n];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        
        System.out.print("Array 1 : ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Array 2 : ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        
        System.out.println();
        
        boolean b = true;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                b = false;
                break;
            }
        }
        
        if(b){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}

public class Main{
    public static void main(String args[]){
        EqualOrNot eon = new EqualOrNot();
        eon.Check();
    }
}