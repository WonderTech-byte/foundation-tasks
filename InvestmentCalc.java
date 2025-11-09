import java.util.Scanner;
public class InvestmentCalc{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("----SIMPLE INVESTMENT CALC ------");
        System.out.print("Enter an Investment anount: ");
        double investmentAmount = input.nextDouble();
        
         System.out.print("Enter annual Interest in percentage: ");
        double annualInterestRate = input.nextDouble();

         System.out.print("Enter numbers of years: ");
        int year = input.nextInt();
        
            double monthlyInterestRate = annualInterestRate /(12*100);
            double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (year * 12));

        System.out.printf("Future Value is $%.2f%n", futureInvestmentValue);
        

    }
}
