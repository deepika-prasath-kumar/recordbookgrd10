
/*Write a program using a menu to add subtract multiply and divide 2 numbers.*/
import java.util.*;
public class prog36
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a to add, s for subtraction, m for multiplication, d for division");
        char Switch=sc.next().charAt(0);
        switch(Switch)
        {
            case 'a':
                {
                    int result=add();
                    System.out.println("The sum of the 2 numbers is "+result);
                    break;
                } 
            case 's':
                {
                    int result=sub();
                    System.out.println("The subtraction of the 2 numbers is "+result);
                    break;
                }
            case'm':
                {
                    int result=mul();
                    System.out.println("The product of the 2 numbers is "+result);
                    break;
                }
            case 'd':
                {
                    int result=div();
                    System.out.println("The quotient of the divsion of the 2 numbers is "+result);
                    break;
                }
        }
    }
    static int add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int add=n1+n2;
        return(add);
    }
    static int sub(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sub=n1-n2;
        return(sub); 
    }
    static int mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int mul=n1*n2;
        return(mul);
    }
    static int div(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int div=n1/n2;
        return(div); 
    }
}