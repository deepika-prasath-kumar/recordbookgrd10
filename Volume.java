/*Write a class with the name volume, using function overloading that computes the volume of a cube, sphere, and a cubioid*/
import java.util.*;
public class Volume
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the cuboid");
        int s=sc.nextInt();
        vol(s);
        System.out.println("Enter the radius of the sphere");
        double radi=sc.nextDouble();
        vol(radi);
        System.out.println("Enter the length, breadth and height of the cuboid");
        int le=sc.nextInt();
        int he=sc.nextInt();
        int br=sc.nextInt();
        vol(le,br,he);
    }
    static void vol(int a)
    {
        int cube=a*a*a;
        System.out.println("Volume of cube is"+cube);
        
    }
    static void vol(double r)
    {
        double area=(4.0*(22/7.0)*(r*r*r)/3.0);
        
        System.out.println("Volume of sphere is"+area);
    }
    static void vol(int l,int b, int h)
    {
        int cuboid=l*b*h;
        System.out.println("Volume of cuboid is"+cuboid);
    }
}