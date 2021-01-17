package com.dhavalkurkutiya;

public class CWH24BreakandContinue {
  public static void main (String[] args) {
    // Break and continue
    /*
    for (int i = 0; i<5; i++){
      System.out.println(i);
      System.out.println("Java is tha Best");
      if (i==2){
        System.out.println("Ending tha Loop");
        break;
      } 
    }
    */
    /*
    int i = 0;
    while (i<5){
      System.out.println(i);
      System.out.println("Java is tha Best");
      if (i==2){
        System.out.println("Ending tha Loop");
        break;
      }
      i++;
    } 
    */
    /*int i = 0;
    do{
      System.out.println(i);
      System.out.println("Java is tha Best");
      if (i==2){
        System.out.println("Ending tha Loop");
        break;
      }
      i++;
    }while(i<5);
    System.out.println("Ending tha Loop");
    */
    
    
    for (int i = 0; i<5; i++){
      if (i==2){
        System.out.println("Ending tha Loop");
        continue;
      } 
      System.out.println(i);
      System.out.println("Java is tha Best");
    }
    
    /*
    int i = 0;
    while (i<5){
      if (i==2){
        System.out.println("Ending tha Loop");
        continue;
      }
      i++;
      System.out.println(i);
      System.out.println("Java is tha Best");
    } 
  */
  /*
    int i = 0;
    do{
      i++;
      if (i==2){
        System.out.println("Ending tha Loop");
        continue;
      }
      System.out.println(i);
      System.out.println("Java is tha Best");
    }while(i<5);
    System.out.println("Ending tha Loop");
  */
  }
}
