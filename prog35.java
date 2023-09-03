/*Write a program using  amenu to add subtract multiply and  divide2 numbers.*/
import java.util.*;
public class prog35
{
    public static void main(String[]args)
    {
        
    }
    static void numbers(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a for addition, s for subtraction, m for multiplication and d for division");
        char Switch=sc.next().charAt(0);
        
        System.out.println("Enter the first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();
        
        switch(Switch){
            case 'a':
                {
                  int add=n1+n2;
                  System.out.println(add);
                  break;
                }
            case 's':
                {
                    int sub=n1-n2;
                    System.out.println(sub);
                    break;
                }
            case 'm':
                {
                    int mul=n1*n2;
                    System.out.println(mul);
                    break;
                }
             case 'd':
                {
                    int div=n1/n2;
                    System.out.println(div);
                    break;
                }
        }
        
    }
}