import java.util.Scanner;
public class RunawayLengthCal{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

        System.out.println("-----------RUNWAY LENGTH -----------");
        System.out.print("Enter speed and acceleration: ");
            double velocity = input.nextDouble();
            double acceleration= input.nextDouble();

            double length = Math.pow(velocity, 2) / (acceleration* 2);
            System.out.printf("The minimum runway length for this airline is %.2f%n", length);
	}
}
