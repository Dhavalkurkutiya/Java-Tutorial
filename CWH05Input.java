package com.dhavalkurkutiya;
import java.util.Scanner;
public class CWH05Input {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbar_1");
    int a = sc.nextInt();
    System.out.println("Enter Numbar_2");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("Sum of this numbar " + sum);
    
    // boolean hasNextInt = sc.hasNextInt(); // Check valu
    // System.out.println(hasNextInt);
    
    // String str_1 = sc.next(); // "next"
    // System.out.println(str_1);
   
    // String str_2 = sc.nextLine(); // "nextLine"
    // System.out.println(str_2);
  }
}
