package ca.bcit.comp1510.lab2;

import java.util.Scanner;

/*
 * 
 * Circle, calculating some 
 * important values of a Circle
 * @author nirajanmanandhar
 * @ version 1
 * 
 */
public class Circle {
  
    /*
     * Drives the program
     * @param args unused
     * 
     */

    public static void main(String[] args) {
        
        final double PI = 3.14159;
        
        Scanner myScanner = new Scanner(System.in);
            
        System.out.println("Enter a radius value:");
        
        //The radius will be user-input
        double radius = myScanner.nextDouble();
        double doubleradius = 2 * radius;
        
        //These are the circumference variables
        double circumference = 2 * PI * radius;
        double doublecircumference = 2 * PI * doubleradius;

        System.out.println("The circumference is: " + circumference);
        
        //These are the area variables
        double area = PI * radius * radius;
        double doublearea = PI * doubleradius * doubleradius;
        
        System.out.println("The area of the circle is: " + area);
        
        //Calculations for how much bigger.
        double c_diff = doublecircumference/circumference;
        double a_diff = doublearea/area;
        
        System.out.println("With double the radius, the area would be " +
        a_diff + " times larger,\nand the circumference would be " + c_diff + " times larger." );
        
        
        
        myScanner.close();
    }

}
