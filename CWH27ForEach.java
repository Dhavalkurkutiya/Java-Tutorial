package com.dhavalkurkutiya;

public class CWH27ForEach {
  public static void main (String[] args) {
  /*
    int [] Marks = {10,20,30,40,50,60,70,80,90,100}; 
    float [] Marks = {10.1f,20.2f,30.3f,40.4f,50.5f,60.6f,70.7f,80.8f,90.9f,100.10f}; 
    System.out.println(Marks.length);
    System.out.println(Marks[1]);
    
    String [] name = {"Dhaval" , "Harry" , "Lovesh"};
    System.out.println(name.length);
    System.out.println(name[0]);
  */
    // Display tha Array (Naive Ways)
  /*  int [] Marks = {10,20,30,40,50}; 
    System.out.println(Marks[0]); 
    System.out.println(Marks[1]); 
    System.out.println(Marks[2]); 
    System.out.println(Marks[3]); 
    System.out.println(Marks[4]);
  */
    // Display tha Array (Fore Loop)
  /*  
  System.out.println("Display Arry Using Fore loop");
  int [] Marks = {10,20,30,40,50,60,70,80,90,100}; 
    for (int i = 0; i<Marks.length;i++){
      System.out.println(Marks[i]);
    }
  */
  
  /*
    // Display tha Array in Reverse order(Fore Loop)
    System.out.println("Display Arry Using Fore loop  in Reverse order");
    int [] Marks = {10,20,30,40,50,60,70,80,90,100}; 
    for (int i = Marks.length -1; i>0;i--){
      System.out.println(Marks[i]);
    }
  */
  
     // Display tha Array (For Each Loop)
    System.out.println("Display Arry Using Fore Each loop");
    int [] Marks = {10,20,30,40,50,60,70,80,90,100}; 
    for(int element : Marks){
      System.out.println(element);
    }
  }
}
