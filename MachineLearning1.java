
package machinelearning1;
import java.util.Scanner;

public class MachineLearning1 {

    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);    
        
        System.out.println("Enter Feet: ");
        int feet = s.nextInt(); 
        s.nextLine();
         
        System.out.println("Enter Inches: ");
        int inches = s.nextInt();
        s.nextLine();
                
        System.out.println("The number you entered are " + feet + " for feet and " + inches + " for inches." );
        
        int totalInches = ( feet * 12 ) + inches;
        double noCentimeters = totalInches * 2.54;
        
        System.out.println("The total number of inches: " + totalInches);
        System.out.println("The number of centimeter: " + noCentimeters);
    }
    
}
