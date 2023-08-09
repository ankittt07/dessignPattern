package conceptOfAccessModifier;

public class childClass extends parentClass{
    public static void main(String[] args) {
        System.out.println();
        // needs to create an object for a non static method
        parentClass obj = new childClass();
        System.out.println(obj.a);
       // System.out.println(obj.);  private variables and method cannot be access outside the class limitation is only within the class body
        System.out.println(obj.b); //  protected keywords can be access outside the class but inside the same package
        // default means if no access modifier is defined with any of the variables they should be treated as default access modifier

    }
}
