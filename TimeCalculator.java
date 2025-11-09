import java.util.Scanner;
public class TimeCalculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    
    System.out.println("------SECONDS TO DAY ANF YEAR CALCULATOR ----- ");
    System.out.print("Enter minutes(while number between: ");
    int minutes = input.nextInt();
    int baseConverter = 1440 * 365;

    int year = minutes / baseConverter;
        
     while(minutes <= 0){
        System.out.print("Enter Number above 0: ");
        minutes = input.nextInt();

     }
        if(year * baseConverter < minutes ){
           int remains = minutes - year * baseConverter;
           int days = remains / 1440;
           System.out.println(minutes + "minutes is approximately " + year + " year(s) and " + days + " days");
    
        }else{ 
            System.out.println(minutes +"minutes is approximately " + year );
         }
 
    }
}
