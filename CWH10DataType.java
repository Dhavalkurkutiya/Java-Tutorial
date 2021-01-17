package com.dhavalkurkutiya;

public class CWH10DataType {
  public static void main (String[] args) {
    byte x = 5;
    int  y = 6;
    short z = 8;
    int a = y + z;
    float b = 6.54f + x;
    System.out.println(b);
    
    int p = 56;
    System.out.println(y++);
    System.out.println(++y);
    
    int j = 64;
    System.out.println(j++);
    System.out.println(++j);
    
    int chr = 'c';
    System.out.println(++chr);
  }
}
