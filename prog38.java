/*Write a program using a menu to add subtract multiply and divide 2 numbers. NO return, with arguments*/
import java.util.*;
public class prog38
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Enter a for addition, s for subtraction, m for multiplication and d for division");
        char t=sc.next().charAt(0);
        switch(t)
        {
            case 'a':{
                    add(n1,n2);
                    break;
                }
            case 's':
                {
                    sub(n1,n2);
                    break;
                }
            case 'm':
                {
                    mul(n1,n2);
                    break;
                }
            case 'd':
                {
                    div(n1,n2);  
                    break;
                }

        }

    }
    static void add(int a,int b)
    {
        int add=a+b;
        System.out.println("The sum of the 2 numbers is:"+add);
    }

    static void sub(int a,int b)
    {
        int sub=a-b;
        System.out.println("The diffrence of the 2 numbers:"+sub);
    }

    static void mul(int a,int b)
    {
        int mul=a*b;
        System.out.println("The product of the 2 numbers is:"+mul);
    }

    static void div(int a,int b)
    {
        int div=a/b;
        System.out.println("The quotient when the 2 numbers are divided is:"+div);
    }
}