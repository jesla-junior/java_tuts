//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'getArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. 

import java.util.Scanner;

class Exercise6{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter length of rectangle: ");
        double x = input.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double y = input.nextDouble();
        
        Area rectangle1 = new Area (x,y);
        System.out.println("The area of the rectangle is " +rectangle1.getArea()+ " cubic units");
        
        
    }
}


class Area{
    
    double length;
    double width;
    
    //constructor
    public Area(double length, double width){
        this.length = length;
        this.width = width; 
    }
    
    public double getArea(){
        
        return (this.length * this.width);
    } 
}