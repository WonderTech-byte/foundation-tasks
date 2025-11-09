import java.util.Scanner;
public class NewtonMotion{
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);

        double initialVel;
        double timeTaken;
        double acceleration;

          System.out.println("---NEWTON MOTION CALCULATOR------");
          System.out.print("Enter InitialVelocity, timeTaken and Acceleration: ");
          initialVel = input.nextDouble();
          timeTaken = input.nextDouble();
          acceleration = input.nextDouble();
            
            double distance = initialVel * timeTaken + (acceleration* timeTaken*timeTaken)/2;
        System.out.printf("The Distance covered is %.2f%n", distance);


    }
}
