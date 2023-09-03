/*Prog62: Wap to find frequency of a word inputted*/
import java.util.*;
public class prog62
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        System.out.println("Enter the word to find the frequency off");
        String word=sc.next();
        int l=sentence.length();
        String w="";
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' ')
            {
                if(w.equals(word))
                {
                    count++;
                }
                w="";
            }
            else{
                w=w+ch;
            }
        }
        System.out.println("The frequency of the word entered is"+count);
    }
}