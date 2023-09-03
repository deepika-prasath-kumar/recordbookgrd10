/*wap to intialize an array of 10 numeric elements sorted in ascending order accept a value from user and using binary search method print out the cell
position the number occupies in the array*/
import java.util.*;
public class prog12
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0;i<10;i++)
        {
            array[i]=sc.nextInt();
        }
        
         System.out.println("Enter the value you want to look for: ");
         int n=sc.nextInt();
        int l=0;
        int m=0;
        int h=array.length-1;
        int index=-1;
        while(l<=h)
        {
            m=(l+h)/2;
            if(n<array[m])
            {
                h=m-1;
            }
            else if(n>array[m])
            {
                l=m+1;
            }
            else
            {
                index=m+1;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("Your number was not found");
        }
        else
        {
            System.out.println("The cell position is "+index);
        }
    }
}