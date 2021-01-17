package com.dhavalkurkutiya;

public class CWH09Associativity {
public static void main (String[] args) {
    // Precedence && Associativity
    int a = 6*5 - 34/2; // Precedence
    /*
    = 6*5 - 34/2
    = 30 - 17
    = 13
    */
    int b = 60/5 - 34*2; // Associativity
    /*
    =   60/5 - 34*2
    = 12 - 68
    = -56
    */
    System.out.println(a);
    System.out.println(b);
    
    //Exsize_lets_go
    int x = 5;
    int y = 10;
    int k = (x * y)/2;
    System.out.println(k);
    
    int m = 1;
    int n = 4;
    int o = 5;
    int ans = b*b - (4*o*n)/(2*o);
    System.out.println(ans);
  }
}
