//5- write a prog to initialise an array for 20 numbers and print only the even numbers from the array together 
import java.util.*;
public class prog5
    {
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int array[]=new int[20];
            System.out.println("Enter 20 numbers: ");
            for(int i=0;i<20;i++){
              array[i]=sc.nextInt();  
            }
            for(int i=0;i<20;i++){
                if(array[i]%2==0){
                    System.out.println(array[i]);
                }
            }
        }
    }
