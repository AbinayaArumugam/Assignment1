package com.assignment;
import java.util.Scanner;
public class Reverse {
 public static void main(String args[])  {
int number, reminder;
Scanner input = new Scanner(System.in);
number = input.nextInt();
while(number!=0)
{
reminder = number%10;
number /=10;
 System.out.print(reminder);
}
}
}