//wap to enter names of 10 students in an arrray and ask the user to enter name and locate that perticular student using linear search
import java.util.*;
public class prog11
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[10];
        System.out.println("Enter 10 names");
        for(int i=0;i<10;i++)
        {
            names[i]=sc.next();
        }
        System.out.println("Enter the name to find: ");
        String n=sc.next();
        for(int i=0;i<10;i++)
        {
            if(n.equalsIgnoreCase(names[i]))
            {
                int index=i+1;
                System.out.println("The name is there and the location is "+index);
            }
        }
    }
}