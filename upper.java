import java.io.*;
import java.util.*;
  public class upper{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any String:");
      String str=sc.nextline();
      for(int i=0;i<str.length;i++)
      {
      if(i==str.charAt(0) || str.charAt(i-1)==" ")
      {
      System.out.println(" "+Str.charAt(i).toUpperCase);
      }
      else{
      System.out.println(" "+Str.charAt(i));
      }
      }
     }
   }  
