import java.util.Scanner;

public class BasicSwingApp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter any number for series.");
            // int upto=input.nextInt();
            // int b=1;
            // int a=0;
            // for(int i=0;i< upto;i++){
            //     // int c=b+a;
            //     //     System.out.println(c);
            //     //     a=b;
            //     //     b=c;
            //     for(int j=0;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            
            int num1=input.nextInt();
            int palindromeNumberIs=findNextPalindrome(num1);
            System.out.println("Next palindrome number is :" + palindromeNumberIs);
        }

        
    }

    public static boolean numIsPalindrome(int num3){
        int orignal=num3;
        int revers=0;
        while (num3!=0) {
            int digit=orignal%10;
            revers = revers*10 +digit;
            num3 /=10;
        }

        return orignal==revers;

    }
    public static int findNextPalindrome(int num2){
        num2++;
        while (true) {
            if (numIsPalindrome(num2)) {
                return num2;
            }
        }
        
    }
    
}

