package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/*
 * Paint
 * @author nirajanmanandhar
 * @version 1
 * 
 */
public class Paint {
    /*
     * Drives the program
     * @param args unused
     * 
     */

    public static void main(String[] args) {
        final int COVERAGE = 400;
        Scanner myScanner = new Scanner(System.in);
        
        //User-input Length value
        System.out.println("Please enter the length of the room in feet.");
        float length = myScanner.nextFloat();
        
        //User-input Width value
        System.out.println("Please enter the width of the room in feet.");
        float width = myScanner.nextFloat();
        
        //User-input Height value
        System.out.println("Please enter the height of the room in feet.");
        float height = myScanner.nextFloat();
        
        //User-input number of coats of paint
        System.out.println("Please enter the number of coats of paint that are going to be applied.");
        int coats = myScanner.nextInt();
        
        //Surface area calculation
        float surfaceArea = (2 * length * height) + (2 * width * height) + (length * width);
        System.out.println("The surface area is: " + surfaceArea + " square feet.");
        
        float coverageNeeded = (coats * surfaceArea);
        
        float cansOfPaintNeeded = coverageNeeded/COVERAGE;
        
        //Taking the floating point number and using the next largest int.       
        System.out.println("You need to buy " + Math.ceil(cansOfPaintNeeded) +" cans of paint.");
        
        myScanner.close();
        
    }

}
