import java.util.Scanner;
/**
 *Finds users index number of integer they entered
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for integers
    System.out.println("Please enter in 10 integers to put into the array");

    //declare a constant
    final int USER_INTEGER = 10;

    //create array with 10 spots
    double[] number = new double[USER_INTEGER];
    
    //put integers into array into for loop
    for(int i = 0; i < number.length; i++){
      number[i] = input.nextDouble();
      }
    
     //ask user for a number to find
     System.out.println("Please enter a number to find");
     //declare a variable to store users number
     int finalNum = input.nextInt();
    //use a for loop to go through array
    for(int i = 0; i < number.length; i++){
     //use if statement to find index
     if(finalNum == number[i]){
       System.out.println(finalNum + " is located at index " + i);

     }
    }

  }
}
