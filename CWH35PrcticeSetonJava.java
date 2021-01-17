package com.dhavalkurkutiya;

public class CWH35PrcticeSetonJava {
  static void multiplication(int n){
    for (int i = 1; i<=10; i++){
      System.out.format("%d X %d = %d\n", n, i, n*i);
    } 
  }
  static void pattern1(int x){
    for (int i = 0; i<x; i++){
      for (int j = 0; j<i; j++){
        System.out.print("*");
      } 
      System.out.println();
    } 
  } 
  
  //sum(n) = 1 + 2 + 3...+ n
  //sum(n) = 1 + 2 + 3...+ n-1 + n
  //sum(n) = sum(n-1) + n;
  
  //sum(n) = 3 + sum(2);
  //sum(n) = 3 + 2 + sum(1);
  //sum(n) = 3 + 2 + 1;
  
  static int sumRec(int n){
    if (n == 1){
      return 1;
    }
    else{
      return n + sumRec(n-1);
    }
  }
  static int fib(int n){
    /*
    if (n == 1){
      return 0;
    }
    */
    if (n == 1  || n == 2){
      return n-1;
    } 
    else if (n == 2){
      return 1;
    } 
    return fib(n-1) + fib(n-2);
  }
  
  public static void main(String[] args) {
  // Problem_1    
    multiplication(5);
    
  // Problem_2
  pattern1(8);
  
  // Problem_3
  int c = sumRec(5);
  System.out.println(c);

  // Problem_4
  
  // Problem_5
  // Fibonacci 0,1,1,2,3,5,8,13
  int result = fib(8);
  System.out.println(result);
  
  }
}


