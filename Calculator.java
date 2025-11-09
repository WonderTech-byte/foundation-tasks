import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    int leftOver = 0;
    int dozen = 0;
    int grossBase  = 144;

    System.out.println("---SIMPLE DOZEN AND GROSS CALCULATOR ----);
    System.out.print("How Many Eggs do you have: ");
    int numberOfEggs = input.nextInt();


    if(numberOfEggs > 500){
        int gross = numberOfEggs /grossBase;
        if(gross * grossBase < numberOfEggs){
            int remains = numberOfEggs - gross * grossBase;
            dozen = remains/ 12;
                if(dozen * 12 < remains){
                      leftOver = remains - dozen * 12;
                    System.out.println("Gross: " + gross + " gross of Eggs\nDozen: " + dozen + "dozens of Eggs\nRemains: " + leftOver);
                }
        }
    
    }else if (numberOfEggs <= 500){
        dozen = numberOfEggs / 12;
        if(dozen * 12 < numberOfEggs){
            leftOver = numberOfEggs - dozen * 12;
            System.out.println("Dozen:  " + dozen + " dozens of Eggs\nRemainder: " + leftOver);    
        }else{
            System.out.println("You av " + dozen + " dozens of Eggs");
        }
    }else{
        System.out.println(" ");
    }
        

     

    }
}
