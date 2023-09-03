//write a prog to enter 10 numbers and print it in reverse order 
import java.util.*;
public class prog2
{
    public static void main(String[]args)
    {
        int array[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
