package com.assignment;
import java.util.Scanner;
public class PerfectNumber    {
  public static void main(String args[])    {
   Scanner input = new Scanner(System.in);
   int T;
   T= input.nextInt();
   while(T>0)   {
   int n,i,div,sum=0;
   n = input.nextInt();
   for(i=1;i<n;i++)    {
    div=n%i;
    if(div==0)  
    {
      sum=sum+i;
    } 
   }
    if(sum==n)   {
     System.out.println("True");
    }
    else    {
      System.out.println("False");
    }
  T--;
 }
}
}