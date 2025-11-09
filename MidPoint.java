
public class MidPoint{
    public static void main(String[]args){
        
    double x1 = 0;  double x2 =2; 
    double y1 =0;   double y2=1; 
    double midX = (x1 + x2)/2; 
    double midY = (y1 + y2)/2;
    
     System.out.println("    a        b     Middle Point      ");
     System.out.printf("(%.0f,   %.0f)  (%.0f, %.0f)    (%.1f,  %.1f) %n", x1, y1, x2, y2, midX, midY);

        x1 = 1;     x2 = 4;
        y1 = 4;     y2 = 2;
        midY = (y1 + y2)/2; 
        midX = (x1 + x2)/2;  
     System.out.printf("(%.0f,   %.0f)  (%.0f, %.0f)    (%.1f,  %.1f) %n", x1, y1, x2, y2, midX, midY);      

        x1 = 2;     x2 = 6;
        y1 = 7;     y2 = 3;
        midY = (y1 + y2)/2; 
        midX = (x1 + x2)/2;  
     System.out.printf("(%.0f,   %.0f)  (%.0f, %.0f)    (%.1f,  %.1f) %n", x1, y1, x2, y2, midX, midY); 

        x1 = 3;     x2 = 10;
        y1 = 9;     y2 = 5;
        midY = (y1 + y2)/2; 
        midX = (x1 + x2)/2;  
     System.out.printf("(%.0f,   %.0f) (%.0f, %.0f)    (%.1f,  %.1f) %n", x1, y1, x2, y2, midX, midY);           
    
        x1 = 4;     x2 = 12;
        y1 = 11;    y2 = 7;
        midY = (y1 + y2)/2; 
        midX = (x1 + x2)/2;  
     System.out.printf("(%.0f,  %.0f) (%.0f, %.0f)    (%.1f,  %.1f) %n", x1, y1, x2, y2, midX, midY);           
    
    }
}
