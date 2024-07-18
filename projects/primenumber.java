import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any number");
        int num=input.nextInt();
        boolean isprime=true;
        for(int i=2;i<num/2;i++){
            if (num%i==0) {
                isprime=false;
            }
        }
        if (isprime && num > 1) {
            System.out.println("this is prime number");
            
        }
        else{
            System.out.println("this is not a prime number");
        }
    }
}
