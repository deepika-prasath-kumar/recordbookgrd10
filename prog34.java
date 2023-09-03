/* Prog 34: Write a program to print the table of 3*/
import java.util.*;
public class prog34
{
    public static void main(String[]args)
    {
        
    }
    static void threetable(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of multiples of 3 that you would like");
        int n=sc.nextInt();
        int p;
        for(int i=1;i<=n;i++)
        {
                p = i*3;
                System.out.print(p+" ");
        }
    }
}