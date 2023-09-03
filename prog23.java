import java.util.*;
public class prog23
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[][]=new int[3][3];
        System.out.println("Enter 9 numbers:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                if(array[i][j]%2==0){
                    System.out.print(array[i][j]+"\t");
                }
                System.out.println();
            }   
        } 
    }  
}