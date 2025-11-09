import java.util.Scanner;
public class DistanceCalc{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Distance to cover: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per Gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per Gallon: ");
        double pricePerGallon = input.nextDouble();
            
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
            System.out.printf("The cost of driving is %.2f%n", costOfDriving);

    }
}
