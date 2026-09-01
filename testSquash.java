/*
Write a method called squash() that does the following:

squash() takes an array of non-negative ints as input. When the method completes,
the array should contain the same numbers as the input array, but wherever the
array had two or more consecutive duplicate numbers, they are replaced by one
copy of the number. Hence, after squash() is done, no two consecutive numbers
in the array are the same.

Any unused elements at the end of the array are set to -1.

For example, if the input array is
[ 0 0 0 0 1 1 0 0 0 7 7 7 1 1 0 ],
the output will read
0 1 0 7 1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 ]
after squash() completes

*/

public class testSquash {
    //Prints array
    static void printArray(int[] arr){
        System.out.print("[" + arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
    }
    static int[] squash(int[] arr){
        //Create array same size as original array
        int[] newArr = new int[arr.length];
        newArr[0] = arr[0];
        int differentcounter = 0;
        //iterate through array
        for(int i  = 1; i < arr.length; i++){
            //if != then append
            printArray(newArr);
            if(arr[i] != newArr[differentcounter] && newArr[differentcounter] != -1){
                differentcounter++;
                newArr[differentcounter] = arr[i];
            }
            //else set the last zero of array to -1
            else{
                newArr[arr.length-i+differentcounter] = -1;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 1, 1, 0, 0, 0, 7, 7, 7, 1, 1, 0};
        printArray(squash(arr1));
    }
}
