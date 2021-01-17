package com.dhavalkurkutiya;

public class CWH33VariableArgumeny {
/*
static int sum(int a , int b){
   return a + b;
 }static int sum(int a , int b, int c){
   return a + b + c;
 }static int sum(int a , int b , int c , int d){
   return a + b + c + d;
 }
 */
 static int sum(int x , int...arr){ //Varargs(...arr)
  // Avilabe as int [] arr;
  int result = x;
  for (int a: arr){
    result += a;
  } 
  return result;
 }
  public static void main(String[] args) {
    System.out.println("Welcome to VariableArgumeny tutorial");
    
  /* This proble solution to VariableArgumeny [varargs] */
  // System.out.println("Tha sum is nathing is " + sum(x 4, ...arr 3)); // Not working nmodifi tha code pleae
  }
}
