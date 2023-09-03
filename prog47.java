import java.util.*;
public class prog47
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String word=sc.next();
        int l=word.length();
        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            System.out.println(ch);
        }
    }
}