package oopsConcepts;

public class creationOfObjectConcept {
    creationOfObjectConcept(){
        int i;
        for (i=0;i<5;i++){
            System.out.println("Number of object creation is ::"+i);
        }
    }

    public static void main(String[] args) {
        creationOfObjectConcept obj = new creationOfObjectConcept();
        System.out.println(obj);
    }


}
