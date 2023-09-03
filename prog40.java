/* 40 )Write a program using a menu to add subtract multiply and divide 2 numbers.*/
import java.util.*;
public class prog40
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Enter a for addition, s for subtraction, m for multplication and d for division:");
        char s=sc.next().charAt(0);
        switch(s)
        {
            case 'a':
                int result1=add(n1,n2);
                System.out.println("The sum of the 2 numbers is:"+result1);
                break;
            case 's':
                int result2=sub(n1,n2);
                System.out.println("The diffrence of the 2 numbers is"+result2);
                break;
            case 'm':
                int result3=mul(n1,n2);
                System.out.println("The product of the 2 numbers is"+result3);
                break;
            case 'd':
                int result4=div(n1,n2);
                System.out.println("The quotient gotten by dividing the 2 numbers is"+result4);
                break;
        }
    }
    static int add(int a,int b){
        int add=a+b;
        return(add);
    }
    static int sub(int a,int b)
    {
        int sub=a-b;
        return(sub);
    }
    static int mul(int a,int b){
        int mul=a*b;
        return(mul);
    }
    static int div(int a,int b){
        int div=a/b;
        return(div);
    }
}