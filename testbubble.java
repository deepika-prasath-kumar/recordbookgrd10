import java.util.*;
public class testbubble
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String array[]=new String[10];
        System.out.println("Enter 10 names: ");
        String temp;
        for(int i=0;i<10;i++)
        {
            array[i]=sc.next();
        }
        for(int i=0;i<9;i++)
        {
           for(int j=0;j<10-i-1;j++)
           {
               if(array[j].compareTo(array[j+1])<0){
               temp=array[j];
               array[j]=array[j+1];
               array[j+1]=temp;
             }
           }
        }
        System.out.println("The array sorted in descending order is:");
        for(int i=0;i<10;i++){
            System.out.print(array[i]+" ");
        }
    }
}