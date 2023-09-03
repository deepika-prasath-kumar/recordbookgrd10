//3- write a prog to enter 10 numbers in an array and print the values of those cells whose subscript are odd 
import java.util.*;
public class prog3
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int array[]=new int[10];
       System.out.println("Enter 10 numbers: ");
       for(int i=0;i<10;i++){
          array[i]=sc.nextInt(); 
       }
       for(int i=0;i<10;i++){
           if(i%2!=0){
               System.out.println(array[i]);
           }
       }
    }
}