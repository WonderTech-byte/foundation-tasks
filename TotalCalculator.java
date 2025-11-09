import java.util.Scanner;
public class TotalCalculator{
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
    
      System.out.println(" ---GRATUITY AND TOTAL CALCULATOR---");
      System.out.print("Enter subtotal($): ");
      double subTotal = input.nextDouble();   
        while(subTotal <= 0){
           System.out.print("Enter a valid Number: ");
           subTotal = input.nextDouble();
        }

      System.out.print("Enter Gratuity(%): ");
      double gratuity = input.nextInt();
        while(gratuity <= 0){
           System.out.print("Enter a valid Number: ");
           gratuity = input.nextDouble();
        }
    
      double percentage = (gratuity/100) * subTotal;
      double total = percentage + subTotal;
    
       System.out.println("---RESULT: gratuity is $" + percentage +" and Total is $" + total);
               

    }
}
