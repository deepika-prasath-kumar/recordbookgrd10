/*wap to enter marks of 7 students in an array and sort in descending order using bubble sort method.*/
import java.util.*;
public class prog14
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[7];
        System.out.println("Enter marks of 7 students");
        for(int i=0;i<7;i++){
            array[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<(6)-i;j++){
              if(array[j]<array[j+1]){
                  temp=array[j];
                  array[j]=array[j+1];
                  array[j+1]=temp;
              }
            }
        }
        System.out.println("The array in descending order is: ");
        for(int i=0;i<7;i++){
            System.out.print(array[i]+" , ");
        }
    }
}