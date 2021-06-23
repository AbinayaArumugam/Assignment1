package com.assignment;
import java.util.Scanner;
class FirstDigit {
private static Scanner input;
 public static void main(String args[])  {
  int n,l;
   input = new Scanner(System.in);
   n =input.nextInt();
  while(n>=10)
{
  l=n%10;
  n=n/10;
}
System.out.println(n);
}
}
 