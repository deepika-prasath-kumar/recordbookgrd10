//6- write a prog to accept values in two arrays of 10 cells each, store the sum of the corresponding cells in a 3rd array, and display the resultant array
import java.util.*;
public class prog6{
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int arrayA[]=new int[10];
       int arrayB[]=new int[10];
       int arraytotal[]=new int[10];
       System.out.println("Enter 10 numbers for the first array: ");
       for(int i=0;i<10;i++){
           arrayA[i]=sc.nextInt();
       }
       System.out.println("Enter 10 numbers for the second array: ");
       for(int i=0;i<10;i++){
           arrayB[i]=sc.nextInt();
       }
       System.out.println("The sum of the correponding cells in both the arrays is: ");
       for(int i=0;i<10;i++){
           arraytotal[i]=arrayA[i]+arrayB[i];
           System.out.println(arraytotal[i]);
       }
   }
}