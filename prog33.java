import java.util.*;
public class prog33{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String names[]=new String[10];
        int mark[][]=new int[10][3];
        char grade = '-';
        System.out.println("Enter names of 10 students and their marks in 3 subjects");
        for(int i =0; i<10;i++){
            names[i]=sc.next();
            for(int j =0; j<3;j++){
                mark[i][j] = sc.nextInt();
            }
        }
        System.out.println("Name" + "\t" + "Grade");
        for(int i = 0; i<10;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum = sum + mark[i][j];
            }
            int avg = sum/3;
            if(avg<=45){
                grade = 'D';
            }
            if(avg<=60){
                grade = 'C';
            }
            if(avg<=75){
                grade = 'B';
            }
            if(avg>75){
                grade = 'A';
            }
            System.out.println(names[i] + "\t" + grade);
        }
    }
}