package com.dhavalkurkutiya;
class MyEmployee{
  // private access modifire
  private int id;
  private String name;
  
  // This mtahid to getName
  public  String getName(){
    return name;
  }  
  
  // This method to setName
  public void setName(String n){
    this.name = n;
  }
  
  // This method to setId
  public void  setId(int i){
    this.id = i;
  }
  
  // This method to getId
  public int getId(){
    return id;
  }
  
}

public class CWH40AccessMosifireGetterandSetter {
  public static void main(String[] args) {
    MyEmployee harry = new MyEmployee();
    // There an eroor throw dou to private access modifire
    /*
    harry.id = 56;
    harry.name = "Dhavalkurkutiya";
    */
    
    //Set tha harry name 
    harry.setName("CodeWithaHarry");
    System.out.println(harry.getName());
    
    //Set a harry id
    harry.setId(56);
    System.out.println(harry.getId());
    
  }
}
