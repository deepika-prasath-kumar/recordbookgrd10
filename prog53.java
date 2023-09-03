import java.util.*;
public class prog53
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        sentence=sentence.trim();
        sentence=" "+sentence+" ";
        int l=sentence.length();
        char a=sentence.charAt(0);
        
        char ch=' ';
        String word="";
        for(int i=0;i<l;i++)
        {
            ch=sentence.charAt(i);

            int ascii=(int)ch;
            if(ascii>=65 && ascii<90)
            {
                ascii=ascii+32;   
            }
            else if(ascii>=97 &&ascii<122)
            {
               ascii=ascii-32; 
            }
            else{
                ascii=ascii;
            }

            ch=(char)ascii;
            word=word+ch;
        }
        System.out.println(word);
    }
}

