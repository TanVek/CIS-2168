public class Reverser {
  public int[] reverse(int[] nums) {
    // YOUR CODE HERE
    int size = nums.length;
    for(int i = size; i > size/2; i--){
      exch(nums, i-1, size-i);
    }
    return nums; // change this line
  }
  // exchanges the elements at positions i and j in array a
  private void exch(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
