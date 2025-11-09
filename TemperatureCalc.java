import java.util.Scanner;
public class TemperatureCalc{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.println("--------------ENEGRY CALC -------------- ");
        System.out.print("Enter The Amount of water in Kilogram:  ");
        double amountofWater = input.nextDouble();
        System.out.print("Enter the initial Temperature: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter final Temperature: ");
        double finalTemp = input.nextDouble();
            
        double energy = amountofWater * (finalTemp - initialTemp) *4184;
            System.out.printf("The Energy needed is %.2f%n", energy);

    }
}
