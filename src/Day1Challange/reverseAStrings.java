package Day1Challange;

public class reverseAStrings {
    public static void main(String[] args) {
        String str = "this is java";
        // zReverse a string
//        1. convert into char array
//                2. using a loop
//                3. use charAtIndex method
       char[] ch= str.toCharArray();
       String rev = "";
        for (int i = ch.length-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
    }
}
