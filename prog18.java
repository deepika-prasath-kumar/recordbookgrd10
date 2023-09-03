/*wap to intialize an array with n numeric elements and print the eleemnts in ascending order using selection sort method.*/
import java.util.*;
public class prog18
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int n=sc.nextInt();
        String array[]=new String[n];
        String small;
        int pos=0;
        String temp;
        System.out.println("Enter"+n+" names");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.next();
        }
        for(int i=0;i<n;i++){
          small=array[i];
          pos=i;
          for(int j=i+1;j<n;j++)
          {
              if((array[j]).compareTo(small)>0)
              {
                small=array[j];
                pos=j;
              }
          }
          temp=array[i];
          array[i]=array[pos];
          array[pos]=temp; 
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}