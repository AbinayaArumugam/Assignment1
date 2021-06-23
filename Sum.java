package com.assignment;
import java.util.Scanner;
public class Sum  {
 public static void main(String args[])  
{
 int number,reminder,sum=0;
Scanner input = new Scanner(System.in);
number = input.nextInt();
while(number!=0)
{
 reminder=number%10;
sum+=reminder;
number/=10;
}
System.out.println(sum);
}
}