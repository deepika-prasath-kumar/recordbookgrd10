import java.util.*;
public class prog30
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int highest=0;
        int pos=0;
        String names[]=new String[5];
        int marks[]=new int[5];
        System.out.println("Enter the names of 5 students of your array:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the names of the student of your array:");
            names[i]=sc.next();
            System.out.println("Enter the  marks of the student:");
            marks[i]=sc.nextInt();
        }
        
        for(int i=0;i<5;i++)
        {
            
            if(highest<marks[i])
            {
              highest=marks[i];
              pos=i; 
            }
            
        }
        System.out.println("The name of the student is "+names[pos]+" the marks acquired by them is :"+highest);
        
    }

}