package com.assignment;
import java.util.Scanner;
  public class EvenAndOdd  {
   public static void main(String args[])   {
   int N;
   Scanner input = new Scanner(System.in);
   N = input.nextInt();
   int a[] = new int[N];
   System.out.println("Enter all the elements:");
   for(int i =0;i<N;i++)   {
      a[i] = input.nextInt();
   }
   System.out.print("Even Numbers:");
   for(int i=0;i<N;i++)   {
     if(a[i]%2==0)
       System.out.print(a[i] + " ");
    }
    System.out.println(" ");
    System.out.print("Odd Numbers:");
    for(int i=0;i<N;i++)   {
     if(a[i]%2!=0)
      System.out.print(a[i] + " ");
    }
 }
}