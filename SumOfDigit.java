import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
   
    System.out.println("----SIMPLE CALCULATOR -----");
    System.out.print("Enter between (1 - 1000): ");
    int number = input.nextInt();
        while(number >= 1000){
            System.out.print("INVALID NUMBER !!\nEnter between (1 - 1000): ");
            number = input.nextInt();
        }

    int firstDigit = number % 10;
    number = number / 10;
    int secondDigit = number % 10;
    number = number / 10;
    int lastDigit = number % 10;
    
    int sum = lastDigit + secondDigit + firstDigit;
    System.out.println("The sum of the digit is " + sum);


    }
}
