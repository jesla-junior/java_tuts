//Program counts the number of words in a string


import java.util.Scanner;
public class Exercise4 {

  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = input.nextLine();

        System.out.print("Number of words in the string: " + word_Count(str)+"\n");
    }

 public static int word_Count(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; 
    }
 }