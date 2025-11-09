import java.util.Scanner;
public class DistanceCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

    System.out.println("-----DISTANCE CALCULATOR -------");
    System.out.print("Enter Distance in miles: ");
    double distance = input.nextDouble();

        if(distance > 0){
            double kilometer = distance * 1.6;
            System.out.printf("%.2f miles equals: %.2f kilometer%n", distance, kilometer);
        }else{
           while(distance <= 0){
                System.out.print("Enter Number Greater than 0: ");
                distance = input.nextDouble();
                double kilometer = distance * 1.6;
                System.out.printf("%.2f miles equals: %.2f kilometer%n", distance, kilometer);
           }
        }
    }
}
