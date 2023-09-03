//wap to store list of roll numbers and total marks of 35 students of a class and print highest of total marks and roll no of student who attainted it
import java.util.*;
public class prog9
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[35];
        int totalmarks[]=new int[35];
        int highest=0;
        int number=0;
        for(int i=0;i<35;i++)
        {
            System.out.println("Enter the roll number: ");
            roll[i]=sc.nextInt();
            System.out.println("Enter the total marks of the student: ");
            totalmarks[i]=sc.nextInt();
        }
        for(int i=0;i<35;i++){
           if(totalmarks[i]>highest){
             highest=totalmarks[i];  
             number=roll[i];
           }
        }
        System.out.println("The highest marks are "+ highest+" the roll number is "+number);
    }
}