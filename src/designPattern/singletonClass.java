package designPattern;

public class singletonClass {
    private static singletonClass singleton = null; // instance will be created at run time

    private singletonClass(){   // Constructor should be private in nature



    }
    public static singletonClass getSingleton(){
        if (singleton==null){
            synchronized (singletonClass.class){
                if (singleton==null){
                    singleton= new singletonClass();
                }
            }

        }
        System.out.println(singleton);
        return singleton;
    }

    public static void main(String[] args) {
        getSingleton();
    }


}
