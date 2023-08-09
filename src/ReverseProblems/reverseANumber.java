package ReverseProblems;

public class reverseANumber {
    public static void main(String[] args) {
        int num = 1234567;
        //reverse a number logic
        //1. using while loop should be not equal to zero
        //2. using mathematical logics - temp = temp*10 + num%10
        //3. using temp variables that stored the values
        int rem = num%10; //1234567--> 123456
        int reverse=0;
        while (num !=0){
            reverse = reverse*10 + num%10;  // 1234560
            num = num/10; //123456   --> 7
        }
        System.out.println("The reverse of a number is::"+reverse);
    }
}
