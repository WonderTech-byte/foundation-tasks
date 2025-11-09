import java.util.Scanner;
public class MonthlyInterestCalc{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("----SIMPLE INTEREST CALC ------");
        System.out.print("Enter Balance and Rate: ");
        double balance = input.nextDouble();
        double rate = input.nextDouble();
      
            double monthlyInterest= balance *rate /(1200);
            System.out.printf("The Interest is %.4f%n ", monthlyInterest);
    }
}
