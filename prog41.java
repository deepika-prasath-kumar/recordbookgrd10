/*Write a complete Java program that invokes a function satis() to find whether four integers a, b, c, d sent to satis() satisfy the equation a3 +b3+ c3 =d3 
  or not The function satis returns 0 if the above situation is satisfied with the given four numbers otherwise it returns -1.*/
import java.util.*;
public class prog41
{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 4 numbers:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int d=sc.nextInt();
       int result=satis(a,b,c,d);
       if(result==0){
           System.out.println("The condition is satisfied");
       }
       else{
           System.out.println("The condition is not satisfied");
       }
   }
   static int satis(int e,int f,int g, int h)
   {
       if(e*3+f*3+g*3==h*3){
           return(0);
       }
       else{
           return(-1);
       }
   }
}