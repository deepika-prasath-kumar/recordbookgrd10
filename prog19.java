import java.util.*;
public class prog19
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String array[]=new String[5];
        String small;
        int pos=0;
        String temp;
        System.out.println("Entter 5 vowels:");
        for(int i=0;i<5;i++)
        {
            array[i]=sc.next();
        }
        for(int i=0;i<5;i++){
          small=array[i];
          pos=i;
          for(int j=i+1;j<5;j++)
          {
              if((array[j]).compareTo(small)<0)
              {
                small=array[j];
                pos=j;
              }
          }
          temp=array[i];
          array[i]=array[pos];
          array[pos]=temp; 
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}