import java.util.*;
public class prog58
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        sentence=sentence.trim();
        int l=sentence.length();
        
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o')
               {
                System.out.print(ch+" ");
            }
        }
        
    }
}