import java.util.*;
public class prog52
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        sentence=sentence.trim();
        int l=sentence.length();
        int a=0;
        int e=0;
        int ii=0;
        int o=0;
        int u=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a')
            {
                a++;
            }
            if(ch=='e')
            {
                e++;
            }
            if(ch=='i')
            {
                ii++;
            }
            if(ch=='o')
            {
                o++;
            }
            if(ch=='u')
            {
                u++;
            }
        }
        System.out.println("The number of a "+a+" the number of e "+e+" the number of i "+ii+" the number of o "+o+" the number of u "+u);
        
    }
}