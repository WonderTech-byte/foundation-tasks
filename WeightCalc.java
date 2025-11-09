import java.util.Scanner;
public class WeightCalc{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("----SIMPLE WEIGHT CALC ------");
        System.out.print("Enter a number in pounds: ");
        double number = input.nextDouble();
      
            double pounds = number * 0.454;
            System.out.printf("%.2f pound is %.3f Kilogram%n", number, pounds);
    }
} 
