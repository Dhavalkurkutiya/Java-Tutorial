package com.dhavalkurkutiya;
import java.util.Scanner;

public class CWH06CBSE {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    
    // System.out.println("Total Marks is 300");
    
    System.out.println("Mathematics");
    float Mathematics = sc.nextFloat();
    
    System.out.println("Chemistry");
    float Chemistry = sc.nextFloat();
    
    System.out.println("Physics");
    float Physics = sc.nextFloat();
    
    float sum = Mathematics + Chemistry + Physics;
    System.out.println(sum/3 + " %");
  }

}
