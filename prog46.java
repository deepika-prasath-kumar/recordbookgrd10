import java.util.*;
public class prog46
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stars you would like");
        int star=sc.nextInt();
        System.out.println("Enter the character you would like to print");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the number of charaacters you would like to print");
        int number=sc.nextInt();
        hline();
        hline(star);
        hline(number,ch);
    }
    static void hline()
    {
        for(int i=0;i<30;i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    static void hline(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    static void hline(int n,char ch)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ch);
        }
        System.out.println();
    }
}