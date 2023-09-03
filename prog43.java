/*Prog42: Write a class with an overloaded function. compare: void compare(int,int), to compare 2 integers and print the higher numeric values of 
 2 characters and print the greater of the 2 integers. void compare(char,char); to compare the numeric value of 2 characters and print the higher value 
 numeric character. void compare(String,String), to compare the length of 2 strings and print the longer of the 2.*/
 import java.util.*;
 public class prog43
 {
     public static void main(String[]args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 2 integers to compare the numeric values of");
         int a=sc.nextInt();
         int b=sc.nextInt();
         compare(a,b);
         
         System.out.println("Enter 2 characters to compare the numeric values of");
         char c=sc.next().charAt(0);
         char d=sc.next().charAt(0);
         compare(c,d);
         
         System.out.println("Enter 2 strings to compare the numeric values of");
         String e=sc.next();
         String f=sc.next();
         compare(e,f);
     }
     static void compare(int no1,int no2)
     {
       int max=Math.max(no1,no2);
       System.out.println("The greater of the 2 numbers is"+max);
     }
     static void compare(char ch,char ch2)
     {
         int value=(int)(ch);
         int value2=(int)ch2;
         if(value>value2)
         {
             System.out.println("The character with the greater numeric value is"+ch);
         }
         else{
           System.out.println("The character with the greater numeric value is"+ch2);  
         }
     }
     static void compare(String word,String word2)
     {
         int length=word.length();
         int length2=word2.length();
         if(length>length2)
         {
             System.out.println("The string with the greater numeric value is"+word);
         }
         else{
            System.out.println("The string with the greater numeric value is"+word2); 
         }
     }
 }