package com.dhavalkurkutiya;

public class CWH17Logical {
public static void main (String[] args) {
    System.out.println("For Logical AND [&&] ...");
    boolean a = true;
    boolean b = true;
    boolean c = true;
    if (a && b && c){
      System.out.println("Y");
    }
    else{
      System.out.println("N");
    }
    
    System.out.println("For Logical Or [||]...");
    boolean a1 = true;
    boolean b2 = false;
    boolean c3 = true;
    if (a|| b){
      System.out.println("Y");
    }
    else{
      System.out.println("N");
    }
    
   System.out.println("For Logical Not [!]...");
   System.out.print("Not (a) is ");
   System.out.println(!a);
   
   System.out.print("Not (b) is ");
   System.out.println(!b);
   
  }
}
