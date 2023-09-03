/*wap to intialize an array with 5 numeric elements and print the eleemnts in ascending order using selection sort method.*/
import java.util.*;
public class prog17
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        int small=0;
        int pos=0;
        int temp=0;
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
          small=array[i];
          pos=i;
          for(int j=i+1;j<5;j++)
          {
              if(array[j]<small)
              {
                small=array[j];
                pos=j;
              }
          }
          temp=array[i];
          array[i]=array[pos];
          array[pos]=temp; 
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}