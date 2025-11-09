import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    double x1 = 0;  double x2 =0; double x3=0;
    double y1 =0;   double y2=0;  double y3 =0;
    
     System.out.println("---------AREA OF A TRIANGLE CORDINATES ---------");
     System.out.print("Enter the Co-ordinates of three point separated by space: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
            double side1 = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
            double side2 = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
            double side3 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
               double sides = (side1 + side2 + side3)/2;
               double sideProducts = (sides - side1)*(sides - side2)*(sides - side3)* sides;
               double area = Math.sqrt(sideProducts);
              
    
        System.out.printf("the AREA of the Triangle is %.2f%n", area);
    
            
        
    }
}
