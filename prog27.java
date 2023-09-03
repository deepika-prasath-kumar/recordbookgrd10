import java.util.*;
public class prog27
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        int sumL=0;
        int sumR=0;
        int array[][]=new int[n][m];
        System.out.println("Enter the numbers in your array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=sc.nextInt();            
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j){
                    sumL=sumL+array[i][j];
                }
                if(i+j==n-1){
                    sumR=sumR+array[i][j];
                }
            }
        }
        System.out.println("The sum of right diagnol is"+ sumR);
        System.out.println("The sum of left diagnol is"+ sumL);
    }
}