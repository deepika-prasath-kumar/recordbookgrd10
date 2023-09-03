import java.util.*;
public class prog51
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence+" ";
        int l=sentence.length();
        String word="";
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            if(ch!=' ')
            {
               word=word+ch; 
            }
            else{
                System.out.println(word);
                word="";
            }
        }
        
        
    }
}