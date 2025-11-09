import java.util.Scanner;
public class Acceleration{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("-----ACCELERATION CALC -------");
        System.out.print(" Enter V0, V1 and t: ");
        double initialVel = input.nextDouble();
        double finalVel = input.nextDouble();
        double time = input.nextDouble();

            double acceleration = (finalVel - initialVel) / time;
            System.out.printf("The average acceleration is %.4f%n", acceleration);
            
        

    }
}
