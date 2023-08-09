package StringsConcepts;

public class Strings {
    public static void main(String[] args) {
        String str = "This is java";
        //To Upper Case
//        System.out.println(str.toUpperCase());
//
//        // To Lower Case
//        System.out.println(str.toLowerCase());

        //Split returns String Array
        String s[]= str.split(" ");

        // convert string to character aray
        // returns set of char array
        char c[]=str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(c));




    }
}
