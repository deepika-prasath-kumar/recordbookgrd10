import java.util.*;
public class prog26{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();
        int sumC=0;
        int array[][]=new int[n][m];
        System.out.println("Enter the numbers in your array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt(); 
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++){
                sumC=sumC+array[j][i]; 
            }
            System.out.println("The sum column "+(j+1)+" is"+sumC);
            sumC=0;
        }
    }
}