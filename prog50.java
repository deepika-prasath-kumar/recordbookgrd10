import java.util.*;
public class prog50
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        sentence=sentence.trim();
        int l=sentence.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o')
               {
                count++;
               }
        }
        
        System.out.println("The number of vowels in your sentence is"+(count));
    }
}