//This program finds the smallest numner among three numbers

import java.util.Scanner;
public class Exercise1{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        double x = input.nextDouble();
        System.out.println("Input second number: ");
        double y = input.nextDouble();
        System.out.println("Input third number: ");
        double z = input.nextDouble();
        
        System.out.println("The smallest number is " + smallest(x,y,z) + "\n");
    }
    
    public static double smallest(double x, double y, double z){
        
        return Math.min(Math.min(x, y), z);
    }
    
}















