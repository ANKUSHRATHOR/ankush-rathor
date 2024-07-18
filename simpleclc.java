import java.util.Scanner;
public class simpleclc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=input.nextInt();
        System.out.println("select any operater (+ - * /)");
        char operator=input.next().charAt(0);25
        System.out.println("Enter second number");
        int num2=input.nextInt();
        
        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;            
            default:
                System.out.println("envalid operator selected");
                break;
        }

    }
}
