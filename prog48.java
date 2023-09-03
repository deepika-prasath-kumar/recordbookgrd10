import java.util.*;
public class prog48
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        int l=sentence.length();
        int count=1;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        
        System.out.println("The number of words in your sentence is"+(count));
    }
}