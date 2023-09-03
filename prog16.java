import java.util.*;
public class prog16
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String country[]=new String[10];
        String capital[]=new String[10];
        int flag=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the country: ");
            country[i]=sc.next();
            System.out.println("Enter the capital: ");
            capital[i]=sc.next();
        }
        System.out.println("Enter the country you would like the capital of: ");
        String n=sc.next();
        for(int i=0;i<10;i++)
        {
            if(n.equalsIgnoreCase(country[i])){
                System.out.println("The country is "+country[i]+" the capital is "+capital[i]);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The country you entered was not found");
        }
    }
}