import java.util.*;
public class prog7
{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int X[]={5,-3,-2,1,0,12,14,16,25,13};
      int Y[]={6,5,10,15,18,20,22,30};
      int Z[]=new int[18];
      for(int i=0,j=0,k=0;i<16;i++){
          if(i%2==0){
              Z[i]=X[j];
              j++;
          }
          else{
              Z[i]=Y[k];
              k++;
          }
      }
      for(int i=0;i<16;i++){
          System.out.print(Z[i]+" ");
      }
      System.out.print(X[8]+" "+X[9]);
    }
}