package oopsConcepts.InheritenceConcept;

public class childClass extends parentClass{
    public void allElement(){
        super.parentClass("Ankit",123456,21,55000);

    }

    public static void main(String[] args) {
        childClass c1 = new childClass(); // we can create an object of a child class
         c1.allElement();
       // System.out.println();

    }
}
