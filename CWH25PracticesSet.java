package com.dhavalkurkutiya;

public class CWH25PracticesSet {
  public static void main (String[] args) {
    // Practice Problem 1
    /*
    int n = 10;
    for (int i = n; i>0; i--){
      for (int j = 0; j<i; j++){
      System.out.print("*");
      }
      System.out.print("\n");
    } 
    */
    
    // Practice Problem 2
    /*
    int sum = 0;
    int n = 3;
    for (int i = 0; i<n; i++) {
      sum = sum + (2*i);
    }
    System.out.print("Sum of Even Numbers: ");
    System.out.print(sum);
    */
    
    // PracticemProblem 3
    /*
    int n = 5;
    for (int i = 1; i<=10; i++){
      System.out.printf("%d X %d = %d\n", n, i, n*i);
    }
    */
    // PracticemProblem 4
    /*
    int n = 10;
    for (int i = 10; i>=1; i--){
      System.out.printf("%d X %d = %d\n", n, i, n*i);
    } 
    */
    // PracticemProblem 5
    
    
    // PracticemProblem 6
    
    //What is a Factorial n = n*n-1 * n-2 .....1
    // 5! = 5x4x3x3x1 = 120
    /*
    int n = 5;
    int i =1;
    int Factorial = 1;
    while(i<=n){
      Factorial *= i;
      i++;
    }
    System.out.println(Factorial);
    */
    
    // Practice Problem 9
    int n = 8;
    int sum = 0;
    for (int i = 1; i<=10; i++){
      sum += n*i;
    } 
    System.out.println(sum); 
  }
}
