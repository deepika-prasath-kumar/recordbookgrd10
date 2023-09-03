import java.util.*;
public class prog32{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        String city[]=new String[10];
        double temperature[][]= new double [10][2];
        int i=0; int j=0;
        System.out.println("Enter 10 cities and their highest and lowest temperatures respectively(degree celcius)");
        for(i=0; i<10; i++){
            city[i]=sc.next();
            for(j=0; j<2; j++){
                temperature[i][j]=sc.nextDouble();
            }
        }
        double high = temperature[0][0];
        double low = temperature[0][1];
        int pos1 =0;
        int pos2 = 0;
        for(i=0;i<10;i++){
            if(temperature[i][0]>high){
                high = temperature[i][0];
                pos1=i;
            }
            if(temperature[i][1]<low){
                low = temperature[i][1];
                pos2=i;
            }
        }
        System.out.println("The highest temperature is " + high + " for " +city[pos1]);
        System.out.println("The lowest temperature is " + low + " for " +city[pos2]);
    }
}