//wap to enter marks and names of 10 students in two seperate arrays and print it in a formated tabular form
import java.util.*;
public class prog8
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        String names[]=new String[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name: ");
            names[i]=sc.next();
            System.out.println("Enter the marks: ");
            marks[i]=sc.nextInt();
        }
        System.out.println("Name   Marks");
        for(int i=0;i<10;i++) 
        {
          System.out.println(names[i]+"       "+marks[i]); 
        }
    }
}