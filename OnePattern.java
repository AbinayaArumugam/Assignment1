package com.assignment;
import java.util.Scanner;
class OnePattern {
public static void main(String args[])  {
  int number;
  Scanner input = new Scanner(System.in);
  number = input.nextInt();
  for(int i=1;i<=5;i++)   {
    for(int j=1;j<=i;j++)    {
     System.out.print(number +" ");
     }
     System.out.println();
  }
 }
}