import java.util.*;
public class prog31{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        String names[]=new String[10];
        int marks[][]= new int [10][2];
        int i=0; int j=0;
        int sum=0;
        System.out.println("Enter 10 names and marks of 2 tests respectively");
        for(i=0; i<10; i++){
            names[i]=sc.next();
            for(j=0; j<2; j++){
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("Total marks"+"\t"+"Names");
        for(i=0; i<10; i++){
            sum=0;
            for(j=0; j<2; j++){
                sum+=marks[i][j];
            }
            System.out.println(sum+"\t\t"+names[i]);
        }
    }
}