import java.util.*;
public class practise
{
    static void prime()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int flag=0;
      for(int i=2;i<n/2;i++)
      {
        if(n%i==0){
            flag=1;
            break;
        }
      }
      if(flag==0){
          System.out.println("The number is prime");
      }
      else{
          System.out.println("The number is composite");
      }
    }
    public static void main(String[]args){
        prime();
    }
}
