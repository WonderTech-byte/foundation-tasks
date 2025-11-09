import java.util.Scanner;
public class BmiCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.println("-----------BMI HEALTH CALC-----------");
        System.out.print("Enter your Weights in Pounds(lbs): ");
        double weight = input.nextDouble();

        System.out.print("Enter your Height in Inches: ");
        double height = input.nextDouble();

        double bmi = (weight * 703)/(height * height);
             System.out.println("YOUR BMI CATEGORIES: " + bmi);
            

        

    }
}
