import java.util.*;
public class prog22
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        String array[][]=new String[3][3];
        System.out.println("Enter 9 lettters:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                array[i][j]=sc.next();
            }
        }
        for(int i=2;i>=0;i--){
            for(int j=2;j>=0;j--)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }   
    } 
}  
