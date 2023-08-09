package oopsConcepts;

public class creationOfClassAndObject {
     int a =7; // this variables are called as a global variables and limitation should be inside the class only b
     int b=5;
     int c=a+b;
    //constructor concept
    creationOfClassAndObject(){
        System.out.println("Hi I am constructor body");
    }
    // method concept
    //1. method not return anything
     public void sum(){
        int a = 5; // a and b are called as local variables in java , limitation should be only the method levels
        int b = 7;
        int c= a +b;
         System.out.println("The sum is::"+c);
     }
     //2. Method should return integer value to another method
    public int sum(int a,int b,int c){
        //This concept should be used to assigned global values into local variables in java
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("The sum of two value is ::"+c);
        return c;
    }

    public static void main(String[] args) {
        //When we create an object in java anything that written in constructor should calls as an priority
        creationOfClassAndObject obj = new creationOfClassAndObject();
        System.out.println(obj);
    }
}
