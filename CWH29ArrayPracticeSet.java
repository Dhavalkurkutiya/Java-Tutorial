package com.dhavalkurkutiya;
public class CWH29ArrayPracticeSet {
  public static void main(String[] args) {
    /*
      // Practice Problem_1 🐱🐱🐱
      float [] marks = {20.4f , 34.3f , 23.4f , 34.3f , 8.9f};
      float sum = 0;
      for  (float element : marks){
        sum = sum + element;
      }
      System.out.println("This  valu of Sum is :  " + sum);
    }
    */

    // Practice Problem_2 🐱🐱🐱
    /*
    float [] marks = {20.4f , 34.3f , 23.4f , 34.3f , 8.9f};
    float num = 348.3f;
    boolean isInArray = false;
    for  (float element : marks){
      if (num == element){
        isInArray = true;
        break;
      }
    }
    if (isInArray){
    System.out.println("This value is  Present in Array :  " + num);
    }
    else{
    System.out.println("This value is not Present Array : 00");

    */

    // Practice Problem_3 🐱🐱🐱
    /*float[] marks = {20.4f, 34.3f, 23.4f, 34.3f, 8.9f};
    float sum = 0;
    for (float element : marks) {
      sum = sum + element;
    }
    System.out.println("This  valu of average marks is :  " + sum / marks.length);
    */
    
    // Practice Problem_4 🐱🐱🐱
    /*
    int mati1 [][] = {{1 , 2 , 3},
                     {3 , 4 , 5}};
    int mati2 [][] = {{2 , 6 , 13},
                     {5 , 7 , 1}};
    int result [][] = {{0 , 0 , 0},
                     {0 , 0 , 0}};
    for (int i = 0;i < mati1.length; i++){ // row numbar of type
      for (int j = 0;j<mati1[i].length; j++){ //column numbar of type
      System.out.format("Seting value for i = %d and j = %d\n", i ,j);
        result[i][j] = mati1[i][j] + mati2[i][j];
      }
    } 
    
    for (int i = 0;i < mati1.length; i++){ // row numbar of type
      for (int j = 0;j<mati1[i].length; j++){ //column numbar of type
      System.out.print(result[i][j] + " ");
        result[i][j] = mati1[i][j] + mati2[i][j];
      }
    }
      System.out.println(" ");
      */
      
    // Practice Problem_5 🐱🐱🐱
    /*
    ========== Note ==========
      Eroor this code sow Math Class Note add
    int [] arry = {1 , 2 , 3 , 4 , 5 , 6 };
    int l = arry.length;
    int n = Math.floorDiv(l , 2);
    int temp;
    
    for (int i = 0; i<arry.length; i++){
      // Swap a[i] and a[l-1-1]
      // a b temo
      // [4] [3] []
      temp = arry[i];
      arry[i] = arry[l-1-1];
      arry[l-1-1] = temp;
    } 
    for (int element : arry){
      System.out.print(element + " ");
    }
    */
    // Practice Problem_6 🐱🐱🐱
    /*
    int [] arry = {1 , 2 , 3 , 4 , 5 , 6 };
    int max = Integer.MIN_VALUE;
    for(int element : arry){
      if (element > max){
        max = element;
      } 
    }
      System.out.println("This value arry maximum is : " + max);
    */
      
    // Practice Problem_7 🐱🐱🐱
    /*
    int [] arry = {1 , 2 , 3 , 4 , 5 , 6 };
    int max = Integer.MAX_VALUE;
    for(int element : arry){
      if (element > max){
        max = element;
      } 
    }
      System.out.println("This value arry maximum is : " + max);
      
    */
    
    // Practice Problem_8 🐱🐱🐱
   /*
    boolean isSorted = true;
    int [] arry = {1 ,2 , 3 , 4 , 5 , 6 };
    for (int i = 0; i < arry.length-1; i++){
      if (arry[i] > arry[i+1]){
        isSorted = false;
        break;
      }
    } 
    if(isSorted){
      System.out.println("Tha Arry is Sorted");
    }
    else{
      System.out.println("Tha Arry is Not Sorted");
    }
    */
  }
}
