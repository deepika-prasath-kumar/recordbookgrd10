import java.util.*;
public class altword
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first sentence");
        String sentence=sc.nextLine();
        sentence=sentence+" ";
        System.out.println("Enter the second sentence");
        String sentence2=sc.nextLine();
        sentence2=sentence2+" ";
        int l1=sentence.length();
        int l2=sentence2.length();

        String word="";
        String word2="";
        int a=0;
        int b=0;

        for(int i=0;i<l1;i++)
        {
            if(sentence.charAt(i)==' ')
            {
                a++;
            }
        }
        for(int i=0;i<l2;i++)
        {
            if(sentence2.charAt(i)==' ')
            {
                b++;
            }
        }
        String array1[]=new String[a];
        String array2[]=new String[b];

        for(int j=0;j<=a;j++)
        {
            for(int i=0;i<l1;i++)
            {
                char ch=sentence.charAt(i);
                if(ch==' ')
                {

                    array1[j]=word;
                    word="";
                    j++;

                }
                else{
                    word=word+ch;
                }
            }  
        }
        for(int j=0;j<=a;j++)
        {
            for(int k=0;k<l2;k++)
            {
                char ch2=sentence2.charAt(k);
                if(ch2==' ')
                {
                    array2[j]=word2;
                    word2="";
                    j++;
                }
                else{
                    word2=word2+ch2;
                }
            } 
        }

        for(int i=0;i<(a+b)-2;i++)
        {
            System.out.print(array1[i]+" "+array2[i]+" ");
        }
    }
}