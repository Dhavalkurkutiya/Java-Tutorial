package com.dhavalkurkutiya;
/*
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
*/

/*
class CellPhone{
  public void ring(){
  System.out.println("Ringing.....");
  }
  public void vibration(){
  System.out.println("vibration.....");
  }
  public void Call(){
  System.out.println("Ringing.....");
  }
}
*/
/*
class Square {
  int side;

  public int area() {
    return side * side;
  }

  public int perimeter() {
    return 4 * side;
  }
}
*/

class Tommy{
  public void hit(){
    System.out.println("Hithing tha enemy......");
  }
  public void run(){
    System.out.println("Runing from tha enemy......");
  }
  public void fire(){
    System.out.println("Fire on tha enemy......");
  }
}

public class CWH39BasicQuestionsofOOPS {
  public static void main(String[] args) {
    // Problem 1
    /*
    Employee harry = new Employee();
    harry.setName("CodeWithHarry");
    harry.salary = 233;
    System.out.println(harry.getSalary());
    System.out.println(harry.getName());
    */

    // Problem 2
    /*
    CellPhone vivo = new CellPhone();
    vivo.ring();
    vivo.vibration();
    vivo.Call();
    */

    // Problem 3
    /*
    Square sq = new Square();
    sq.side = 3;
    System.out.println("Area is : " + sq.area());
    System.out.println("perimeter is : " + sq.perimeter());
    */
    // Problem 5
    Tommy plyer1 = new Tommy();
    plyer1.hit();
    plyer1.run();
    plyer1.fire();
  }
}
