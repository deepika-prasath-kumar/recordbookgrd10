/*Write a program to print the tables of 3*/
import java.util.*;
public class prog37
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want the table of 3 till:");
        int a=sc.nextInt();
        tables(a);
    }
    static void tables(int n){
        int p;
        for(int i=1;i<=n;i++)
        {
            p=i*3;
            System.out.print(p+" ");
        }
    }
}