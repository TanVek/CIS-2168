public class Reverser {
  public int[] reverse(int[] nums) {
    // YOUR CODE HERE
    return new int[] {}; // change this line
  }
  // exchanges the elements at positions i and j in array a
  private void exch(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
import java.util.Arrays;
public class TestReverser {
  public static void main(String[] args) {
    int[] a = {2, 1, 6, 8};
    Reverser reverser = new Reverser();
    int[] aReversed = reverser.reverse(a);
    System.out.println( Arrays.toString(aReversed) ); // [8, 6, 1, 2]
    int[] b = {2, 1, 5};
    int[] bReversed = reverser.reverse(b);
    System.out.println( Arrays.toString(bReversed) ); // [5, 1, 2]
  }
}
