import java.util.Scanner;
public class ReverseDigit{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

    System.out.println("-----REVERSE NUMBER --------");
    int reverse = 0;
    System.out.print("Enter any 4 digit Number: ");
    int number = input.nextInt();
    
    while(number > 0){
        int lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        number = number /10;
    }
        System.out.println(reverse);



    }
}
