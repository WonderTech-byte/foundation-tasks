import java.util.Scanner;
public class DistanceConvertion{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.println("--------------Distance CALC -------------- ");
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        
            
        double meter = feet * 0.305;
            System.out.printf("%.1f feet is %.4f meters%n",feet, meter);

    }
}
