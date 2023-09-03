/*Prog64: Wap to write a class named STudent*/
import java.util.*;
public class prog64//public class Student
{
    public int roll;
    public String name;
    public String std;
    public char section;
    public static void main(String[]argS)
    {
        prog64 obj1=new prog64();
        obj1.input();
        obj1.print();
        prog64 obj2=new prog64();
        obj2.input();
        obj2.print();
        prog64 obj3=new prog64();
        obj3.input();
        obj3.print();
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your roll number");
        roll=sc.nextInt();
        System.out.println("Enter your standard and section");
        std=sc.next();
        section=sc.next().charAt(0);
    }
    public void print()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll);
        System.out.println("Grade & section: "+std+" "+section);
    }
}