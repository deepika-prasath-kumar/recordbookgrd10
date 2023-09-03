/*Write a program to pass two integer values to a function such that the first number     
 is lower than the second number. The integer value will be the range and the function   would return the sum of the numbers in the range.*/
import java.util.*;
public class prog39
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers, the first number lesser than the second number");
        int nl=sc.nextInt();
        int nh=sc.nextInt();
        int result=sum(nl,nh);
        System.out.println("The sum of numbers in the range is:"+result);
        
    }
    static int sum (int a, int b)
    {
        int sum=0;
        for(int i=a;i<b;i++)
        {
            sum=sum+a;
            a++;
        }
        return(sum);
    }
}