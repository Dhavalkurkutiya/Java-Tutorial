package com.dhavalkurkutiya;

class MyMainEmployee {
  // private access modifire
  private int id;
  private String name;

  // This is Constructor
  public MyMainEmployee() {
    id = 45;
    name = "Your_Name_Hear";
  }

  // This is Constructor
  public MyMainEmployee(String myName, int myId) {
    id = myId;
    name = myName;
  }
  // This is Constructor
  public MyMainEmployee(String myName) {
    id = 5;
    name = myName;
  }
  // This mtahid to getName
  public String getName() {
    return name;
  }

  // This method to setName
  public void setName(String n) {
    this.name = n;
  }

  // This method to setId
  public void setId(int i) {
    this.id = i;
  }

  // This method to getId
  public int getId() {
    return id;
  }
}

public class CWH42Constructorsinjava {

  public static void main(String[] args) {
    // MyMainEmployee harry = new MyMainEmployee("Dhavalkurkutiya",12);
    MyMainEmployee harry = new MyMainEmployee();
    // harry.setName("CodeWithHarry");
    // harry.setId(67);

    System.out.println(harry.getId());
    System.out.println(harry.getName());
  }
}
