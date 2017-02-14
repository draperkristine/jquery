/**
 * @(#)books.java
 *
 *
 * @author 
 * @version 1.00 2016/3/16
 */
import java.util.Scanner;
public class books {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare variables
         int books;
        
        // create scanner object
        
        Scanner keyboard = new Scanner(System.in);
        
        // ask and accept user input
        
        System.out.print("your number of books is?");
        books = keyboard.nextInt();
        keyboard.nextLine();
        
        
        // calculate
        
        if (books = 0)
        	{
        	System.out.print("you have zero points");
        }
        else if (books = 1)
        	{
        		System.out.print("you have five points");
        }
        else if (books = 2)
        	{
        		System.out.print("you have 15 points");
        }
        else if (books = 3)
        	{
        		System.out.print("you have thirty points");
        }
        else if (books >= 4)
        	{
        		System.out.print("you have 60 points");
        }
    }
}
