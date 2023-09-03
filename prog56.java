import java.util.*;
public class prog56
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=sc.nextLine();
        
        int l=sentence.length();
        int upc=0;
        int lwc=0;
        int spc=0;
        int ascii=0;
        for(int i=0;i<l;i++)
        {
            char ch=sentence.charAt(i);
            ascii=(int)ch;
            if(ascii>=65 && ascii<90)
            {
                upc++;
            }
            else if(ascii>=97 && ascii<=122)
            {
                lwc++;
            }
            else{
                spc++;
            }
        }
        System.out.println("The number of upper case characters is "+upc+" the number of lower case chracters is "+lwc+" the number of special characters is "+spc);
        
    }
}