package com.dhavalkurkutiya;

class Eamployee1{
  int id;
  int salery;
  String name;
  public void printDetails(){
    System.out.println("My id "+id);
    System.out.println("My name "+name);
  }
  public int getSalery(){
    return salery;
  }
}
public class CWH38CreatingownJavaClasses {
  public static void main(String[] args) {
    Eamployee1 harry = new Eamployee1(); //Instantiating a new Employees object
    Eamployee1 dhaval = new Eamployee1();
  
    // Set a Attributes harry
    harry.id = 15;
    harry.salery = 12;
    harry.name = "Harry";
    
    // Set a Attributes dhaval
    dhaval.id = 17;
    dhaval.salery = 18;
    dhaval.name = "dhaval";
    
    //Printing tha Attributes
    
    harry.printDetails();
    dhaval.printDetails();
    int salery = dhaval.getSalery();
    System.out.println(salery);
    //System.out.println(harry.id);
    //System.out.println(harry.name);
  }
}
