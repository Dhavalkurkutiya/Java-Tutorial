package com.dhavalkurkutiya;

public class CWH32Mathadoverloadinginjava {
  static void foo(){
    System.out.println("Good Morning !");
  }
  static void foo(int a){
    System.out.println("Good morning ! " + a + " Bro");
  }
  static void foo(int a , int b){ //(int a , int b) Perametter
    System.out.println("Good morning ! " + a + " Bro");
    System.out.println("Good morning ! " + b + " Bro");
  }


  static void chang1(int a) {
    a = 98;
  }

  static void chang2(int[] arry) {
    arry[0] = 70;
  }

  static void tailJocks() {
    System.out.println("Hay I am Dhavalkurkutiya");
  }

  public static void main(String[] args) {
    /* Case:1 Changing Tha Integer */

    tailJocks();
    // int x = 45; // Can't Chang valu of [X]
    // chang1(x);
    // System.out.println("Tha value is x after runing tha chang = " + x);

    /* Case:2 Changing Tha Array */
    // int[] marks = {56, 88, 98, 88, 78}; // Chang this value only refrance pass  
    // chang2(marks);
    // System.out.println("Tha value is chang2 after runing tha chang2 = " + marks[0]);
    
    
    /* Mathadoverloading */
    //foo();
   // foo(a , 333);
    //foo(a , 300 , b ,500); //Argument
  }
}
