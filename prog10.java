//wap to intialize an array with the following values: a1[]={6,2,3,4,1,7,8,5}, accept a vallue from the user and perform linear search to print the cell postition it occupies in the array.
import java.util.*;
public class prog10
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a1[]={6,2,3,4,1,7,8,5};
        System.out.println("Enter the value to be found:");
        int n=sc.nextInt();
        for(int i=0;i<8;i++)
        {
            if(n==a1[i]){
                int cell=i+1;
                System.out.println("The cell position it occupies is "+cell);
            }
        }
    }
}