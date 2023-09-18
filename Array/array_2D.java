//Implemaentation of 2-D Array
import java.util.*;
public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of rows in an array");
        int m =sc.nextInt();
        System.out.println("Enter No. of Columns in an array");
        int n= sc.nextInt();
        //Declation of 2D Array
        int[][]arr = new int[m][n];

        // Initialization of 2D Array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {   System.out.print("Enter No.");
                arr[i][j]=sc.nextInt();
            }
        }
        // Print all the elements
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
                System.out.println();
                
            }}


    }
}
