package com.dhavalkurkutiya;
import java.util.Scanner;

public class CWH18SwitchStament {
public static void main (String[] args) {
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age:");
    age = sc.nextInt();
    
    switch(age) {
      case 18:
        System.out.println("You are Education");
        break;
        
      case 30:
        System.out.println("You are job aply");
        break;
        
      case 60:
        System.out.println("You are job Retaryerd");
        break;
        
      default:
        System.out.println("You are Enjoy Life");
    }
    
    /*
    if (age>56){
      System.out.println("You are Expected");
    } 
    else if (age>45) {
      System.out.println("You are Noob");
    }
    else if (age>30) {
      System.out.println("You are Noob");
    }
    else{
      System.out.println("You are grat");
    }
    */
  }
}
