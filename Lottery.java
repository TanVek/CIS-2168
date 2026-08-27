import java.util.*;
import java.util.ArrayList;
import java.util.random;
public class Lottery
{
   public static void main(String[] args)
   {
      int n = 49; // 1 through n is the set of numbers to draw from
      int k = 6;  // how many numbers will be drawn from this set
      Random rand = new Random(); // Random number generator
      int[] numbers = new int[n];
      // fill the first array with numbers 1 2 3 . . . n
      // YOUR CODE HERE
      for(int i  = 0; i < n; i++){
         numbers[i] = i+1;
         //System.out.println("Number at index + i + " is " + numbers[i]);//Test to print array n
      }

      int[] result = new int[k];
      // draw k numbers from the first array and put them into the second
      int randIndex;
      for(int i = 0; i < k; i++)// ... YOUR CODE HERE
      {
         // make a random index between 0 and n - 1
         randIndex = rand.nextInt(0, n-1);// YOUR CODE HERE
         System.out.println(" The randomized index is " + randIndex + "\tthe number in results[] should be " + numbers[randIndex]); // Test for generating a index number between 0 and n-1
         // pick the element at that random index
         result[i] = numbers[randIndex];// YOUR CODE HERE
         //Tester for the corect number being added into the 
         //System.out.println(result[i]);
         // move the last element (of the first array) into the random location
         // YOUR CODE HERE
      }
      // print the sorted array
      System.out.print("Draw the following integers " +
            "from the set 1 to " + (n + k) + ":");
      System.out.print("[");
      for(int i = 0; i < k-2;  i++) // YOUR CODE HERE
      {
            System.out.print(result[i] + ", ");
      }
      System.out.print(result[k-1] + "]\n");
   }
}