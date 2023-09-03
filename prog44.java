/*Prog44: Write a program to overload the function area, accept values from the user and print out the area of the square,rectangle, circle and triangle*/
import java.util.*;
public class prog44
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int side=sc.nextInt();
        area(side);
        System.out.println("Enter the length and breadth of the rectangle");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        
        area(length,breadth);
        System.out.println("Enter the radius of the circle");
        double radius=sc.nextDouble();
        area(radius);
        System.out.println("Enter the 3 sides of the triangle");
        double d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        area(d,e,f);
    }
    static void area(int s)
    {
        int area1=s*s;
        System.out.println("The area of the square is"+area1);
    }
    static void area(double r)
    {
      double area2=((22/7.0)*r*r);
      System.out.println("The area of the circle is"+area2);
    }
    static void area(int l,int b)
    {
        int area3=l*b;
        System.out.println("The area of the rectangle"+area3);
    }
    static void area(double a,int b,int c)
    {
        double s2=(a+b+c)/2.0;
        double area4=(Math.sqrt(s2*(s2-a)*(s2-b)*(s2-c)));
        System.out.println("The area of the triangle is"+area4);
    }
}