import java.util.*;
public class prog49
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        
        int l=sentence.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        
        System.out.println("The number of spaces in your sentence is"+(count));
    }
}