//This program will find the middle character of a string when passed to it
//if length is odd, it will return one value, else return the 2 middle values

import java.util.Scanner;

public class Exercise3{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter string: ");
        String str = input.nextLine();
        
        System.out.println("The middle character of string is "+ middle(str) + "\n");
    }
    
    public static String middle (String str){
        
        int position, next;
        
        if (str.length()%2 ==0){
            
            position = str.length()/2 -1;
            next = 2;
            
        }else{
            
            position = str.length()/2;
            next = 1;
        }
        
        return str.substring(position, position+next);
    }
}