import java.util.Scanner;
public class RollDice{
    public static void main(String[]args){
      boolean isLess= true;    
      int total = 0; 
     
        Scanner input = new Scanner(System.in);
    System.out.println("DICE ROLL SIMULATION (pick between 1 - 6)");

    System.out.print("The First die: ");
    int firstRoll = input.nextInt();

   if(firstRoll > 6 || firstRoll < 1){
         System.out.println("ENTER VALID PICK FROM 1 - 6!!!");
        while(firstRoll > 6 || firstRoll < 1){
          System.out.print("Enter Number Again: ");
            firstRoll = input.nextInt();
           
        }
        
    }


    System.out.print("The Second die: ");
    int secondRoll = input.nextInt();

   if(secondRoll > 6 || secondRoll < 1){
         System.out.println("ENTER VALID PICK FROM 1 - 6!!!");
        while(secondRoll > 6 || secondRoll < 1){
          System.out.print("Enter Number Again: ");
            secondRoll = input.nextInt();
           
        }
        
    }

    total = firstRoll + secondRoll;
    System.out.println("Your Total Roll is: " + total);
          


    }
}
