package com.dhavalkurkutiya;

public class CWH14StringMathod {
  public static void main (String[] args) {
    String name = "Dhaval";
    System.out.println(name);
    
    int value = name.length();
    System.out.println(value);
    
    String lstring = name.toLowerCase();
    System.out.println(lstring);
    
    
    String Ustring = name.toUpperCase();
    System.out.println(Ustring);
    
    String nonTrimeedString = "     Dhaval Kurkutiya   ";
    System.out.println(nonTrimeedString);
    System.out.println(nonTrimeedString.trim());
    
    System.out.println(name.substring(0));
    System.out.println(name.substring(1,6));
    
    System.out.println(name.replace('a' , 'P'));
    System.out.println(name.replace("a" , "Pu"));
    
    System.out.println(name.startsWith("Dh"));
    System.out.println(name.endsWith("Dh"));
    
    System.out.println(name.charAt(1));
    
    String moddiFay = "Dhahhavadha";
    System.out.println(moddiFay.indexOf("ha"));
    System.out.println(moddiFay.indexOf("ha", 3));
    System.out.println(name.lastIndexOf("a"));
    System.out.println(name.lastIndexOf("a" , 3));
    
    System.out.println(name.equals("Dhaval"));
    System.out.println(name.equalsIgnoreCase("DHavaL"));
   
   System.out.println("I am \"Dha\tval\""); 
  }
}
