//This program is used to find the average of three numbers

import java.util.Scanner;
public class Exercise2{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first number");
        double x = input.nextDouble(); 
        System.out.println("Enter second number");
        double y = input.nextDouble(); 
        System.out.println("Enter third number");
        double z = input.nextDouble(); 
        
        System.out.println("Average of three numbers is: " + average(x, y, z) + "\n");
        
    }
    
    public static double average(double x, double y, double z){
        
        double sum, average;
        sum = x+y+z;
        average = sum/3;
        
        return average;
    }
}

