import java.util.*;/*
Exercise 2.9 Write a method called intersect that accepts two sorted ArrayLists
of Integers and returns a new list that contains only the elements that are found in
both lists. Example: if the lists named list1 and list2 store:
[1, 4, 8, 9, 11, 15, 17, 28, 41, 59]
[4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
Then the call to intersect(list1, list2) returns the list
46 2 Arrays
[4, 11, 17, 28, 59]
*/

public class Intersect {
    static boolean isSorted(int[] list){
        for (int i = 1; i < list.length; i++) {
            System.out.println("Testing number " + list[i] + " is greater than " + list[i-1]);
            if(list[i] < list[i-1]){
                System.out.println("FALSE");
                return false;
            }
            System.out.println("TRUE");
        }
        return true;
    }
    static int[] intersect(int[] list1, int[] list2){
        int[] newList= new int[0];
        for(int num : list1 ){
            for(int num2 : list2){
                if(num == num2){
                    newList = Arrays.copyOf(newList, newList.length + 1);
                    newList[newList.length-1] = num;
                }
            }
        }
        return newList;
    }
    static void printArray(int[] arr){
        System.out.print("[" + arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        //Test the isSorted function 
        int[] list1 = {1, 4, 8, 9, 11, 15, 17, 28, 41, 59};
        int[] list2 = {4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81};
        if(isSorted(list1)) System.out.println("Test Successful");
        int[] list3 = intersect(list1, list2);
        printArray(list1);
        printArray(list2);
        printArray(list3);
        
    }
}

