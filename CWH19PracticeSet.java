package com.dhavalkurkutiya;
import java.util.Scanner;
public class CWH19PracticeSet {
public static void main(String[] args) {
    System.out.println("Java PracticeSet Tutorials");

    // Question_1
    /*
    int a = 10;
    if (a == 11) {
      System.out.println("I am a  11");
    }
    else{
      System.out.println(" I am a  not 11");
    }
    */

    // Question_2
    /*
    byte m1,m2,m3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks in Physics");
    m1 = sc.nextByte();
    System.out.println("Enter your marks in Chemistry");
    m2 = sc.nextByte();
    System.out.println("Enter your marks in Mathematics");
    m3 = sc.nextByte();

    float avg = (m1 + m2 + m3)/3.0f;
    System.out.println("You average " + avg + "% Percentage");
    if (avg>40 && m1>33 && m2>33 && m3>33) {
      System.out.println("Congratulations you tha Pass");
    }
    else{
      System.out.println("Sorry you not a Pass");
    }
    */

    // Question_3
    /*
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter in income in lakhs");
    float income = sc.nextFloat();

    float tax = 0;
    if (income<2.5){
      tax = tax + 0;
    }

    else if (income>2.5f && income<5f){
      tax = tax + 0.05f * (income - 2.5f);
    }

    else if (income>5f && income<=10f){
      tax = tax + 0.05f * (5.0f - 2.5f);
      tax = tax + 0.02f * (income - 5.0f);
    }

    else if (income<10f){
      tax = tax + 0.05f * (5.0f - 2.5f);
      tax = tax + 0.02f * (10.0f - 5.0f);
      tax = tax + 0.03f * (income - 10.0f);
    }
    System.out.println("Tha total text pay by Employed: " + tax);
    */

    // Question_3
    /*
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
    */
    // Question_4
  
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any year:");
    int year = s.nextInt();
    boolean flag = false;
    if (year % 400 == 0) {
      flag = true;
    } 
    else if (year % 100 == 0) {
      flag = false;
    } 
    else if (year % 4 == 0) {
      flag = true;
    } 
    else {
      flag = false;
    }
    if (flag) {
      System.out.println("Year " + year + " is a Leap Year");
    } 
    else {
      System.out.println("Year " + year + " is not a Leap Year");
    }
    
    
    // Question_5
    /*
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Website Example:google.com");
    
    String website = sc.next();
    if (website.endsWith(".org")){
      System.out.println("This website Organization");
    } 
    else if(website.endsWith(".com")){
      System.out.println("This website Commesyal");
    }
    else if(website.endsWith(".in")){
      System.out.println("This website India");
    }
    */
  }
}
