//4- write a prog to initialise the array of 5 elements and print their sum and average 
import java.util.*;
public class prog4
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        System.out.println("Enter 5 numbers: ");
        int total=0;
        int avg=0;
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            total=total+array[i];
            avg=total/5;
        }
        System.out.println("The total of the numbers entered: "+total);
        System.out.println("The avgerage of the numbers entered: "+avg);
    }
}