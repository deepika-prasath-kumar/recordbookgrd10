import java.util.*;
public class Student
{
    public int roll;
    public String name;
    public String std;
    public char section;
    public static void main(String[]argS)
    {
        Student obj1=new Student();
        obj1.input();
        obj1.print();
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