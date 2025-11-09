import java.util.Scanner;
public class EvenAndOdd{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    int counter = 1;    
    int even = 0;
    int odd = 0;

       System.out.print("Enter Numbers (5 numbers seperated by space):  ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
          if(num1 % 2 == 0){
                 even = even + num1;
            }
           else{ 
                odd = odd + num1;
           }
           if(num2 % 2 == 0){
                 even = even + num2;
            }
           else{ 
                odd = odd + num2;
           }
             if(num3 % 2 == 0){
                 even = even + num3;
            }
           else{ 
                odd = odd + num3;
           }
             if(num4 % 2 == 0){
                 even = even + num4;
            }
           else{ 
                odd = odd + num4;
           }
             if(num5 % 2 == 0){
                 even = even + num5;
            }
           else{ 
                odd = odd + num5;
           }
        System.out.println("Sum of Odd Numbers: " + odd);
        System.out.println("Sum of Even Numbers: " + even);
        
        
    
    }
}
