import java.util.*;
public class prog29
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix of your array:");
        int m=sc.nextInt();
        String array[][]=new String[m][m];
        
        System.out.println("Enter the elements of your array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=sc.next();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
        
    }
}