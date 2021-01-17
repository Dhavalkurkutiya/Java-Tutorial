package com.dhavalkurkutiya;

public class CWH31Mathodsinjava {
  static int logic(int x , int y){
    int z;
   if (x > y) {
     z = x + y;
   }
   else{
   z = (x + y) * 5;  
   }
   return z;
  }
  public static void main (String[] args) {
   int  a = 50;
   int b = 7;
   int c ; 
  // Mathod invocation using object Creation
  // CWH31Mathodsinjava obj = new CWH31Mathodsinjava();
   c = logic(a , b);
   System.out.println(c);
   
   int  a1 = 5;
   int b1 = 2;
   int c1 ; 
   
   c1 = logic(a1 , b1);
   System.out.println(c1);
  }
} 
