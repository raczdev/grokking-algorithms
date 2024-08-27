import search.BinarySearch;
import sort.SelectionSort;


public class Main {
    public static void main(String[] args) {
        /*
         * Binary Search
         * Note: It has to be in order
         */
        Integer[] myListForBinarySearch = {1, 2, 3, 5};
        int myNumber = 5;
        BinarySearch.findNumber(myListForBinarySearch, myNumber);
        /*
        * Binary Search
        */

        /*
         * Selection Sort
         */
        Integer[] myListForSelectionSort = {1000, 1000, 112, 3, 4, -5, 10};
        System.out.println(SelectionSort.sortBySelection(myListForSelectionSort));
        /*
         * Selection Sort
         */
    }
}