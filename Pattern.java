package com.assignment;
import java.util.Scanner;
class Pattern  {
public static void main(String args[])  {
int number;
Scanner input = new Scanner(System.in);
number = input.nextInt();

  for(int i=number;i>=0;i--)    {
     for(int j=1;j<=i;j++)   {
        System.out.print(j);
     }
   System.out.println();
  }
 }
}