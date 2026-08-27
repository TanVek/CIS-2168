import java.util.*;
public class InsertMinusSolution {
      public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>(
            List.of("one", "two", "three", "four") );
         System.out.println("list = " + list);

         // insert a + in front of every list element
         
         for (int i = list.size(); i > 0; i--)//.... YOUR CODE HERE ....
            list.add(i-1, "+");
         System.out.println("updated list = " + list);
    }
}