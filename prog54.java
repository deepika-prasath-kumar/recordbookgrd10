import java.util.*;
public class prog54
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
        String result="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if( ch=='e' )
               {
                 ch='*';
               }
               result=result+ch;
        }
        
        System.out.println(result);
    }
}