import java.util.*;
public class prog45
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p for primary school, m for middle school, h for high school");
        char ch=sc.next().charAt(0);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your roll number");
        int roll=sc.nextInt();
        switch(ch)
        {
            case 'p':
                {
                    System.out.println("Enter marks for 4 subjects");
                    int sub1=sc.nextInt();
                    int sub2=sc.nextInt();
                    int sub3=sc.nextInt();
                    int sub4=sc.nextInt();
                    school(sub1,sub2,sub3,sub4);
                    break;
                }
            case 'm':
                {
                    System.out.println("Enter marks for 3 subjects");
                    int eng=sc.nextInt();
                    int math=sc.nextInt();
                    int science=sc.nextInt();
                    school(eng,math,science);
                    break;
                    
                }
            case 'h':
                {
                    System.out.println("Enter marks for 2 subjects");
                    int sub5=sc.nextInt();
                    int sub6=sc.nextInt();
                    school(sub5,sub6);
                    break;
                }
        }
        System.out.println("Your name is: "+name);
        System.out.println("Your roll number is: "+roll);
    }
    static void school(int a,int b,int c,int d)
    {
        int avg=(a+b+c+d)/4;
        double perc=(a+b+c+d)/(100*4.0)*100.0;
        System.out.println("The average marks for 4 subjects is"+avg+" and the percentage is"+perc);
    }
    static void school(int e,int f,int g)
    {
        int avg2=(e+f+g)/3;
        double perc2=(e+f+g)/(100*3.0)*100.0;
        System.out.println("The avg of the 3 subjects is"+avg2+ "The percentage of the marks is"+perc2);
    }
    static void school(int h,int i)
    {
        int avg3=(h+i)/2;
        double perc3=(h+i)/(100*2.0)*100.0;
        System.out.println("The avg of the 2 subjects is"+avg3+ "The percentage of the marks is"+perc3);
    }
}