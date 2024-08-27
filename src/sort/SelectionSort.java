package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    //Method to find the index of the lowest number in the array that was given
    public static int findLowest(List<Integer> arr) {

        int minIndex = 0;

        for (int i = minIndex + 1; i < arr.size(); i++) { //First, it assumes the lowest number is in index 0
            if(arr.get(i) < arr.get(minIndex)) {
                minIndex = i;
            }
        }

        return minIndex;        
    }


    public static List<Integer> sortBySelection(Integer[] arr) {

        List<Integer> tempArray = new ArrayList<>(Arrays.asList(arr)); //Created an array list so we can manage adding and remove more easily
        List<Integer> newArray = new ArrayList<>(); //The final array, we will be adding the lowest numbers, in order, here

        for (int i = 0; i < arr.length; i++) {
            int temp = findLowest(tempArray); //finds the lowest index
            newArray.add(tempArray.get(temp)); //adds to the new array the value in the lowest index
            tempArray.remove(temp); //removes the lowest index that was found, so we can loop the array again and don't find the same number
        }

        return newArray;
    }
}