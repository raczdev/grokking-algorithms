package search;

public class BinarySearch {
    
    public static void findNumber(Integer[] arrayList, int numberToFind) {
        int left = 0;
        int right = arrayList.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arrayList[mid] == numberToFind) {
                System.out.println("Found it! Position: " + mid + " Number: " + arrayList[mid]);
                return;
            } else if (arrayList[mid] > numberToFind) {
                System.out.println("Not found on Position: " + mid);
                right = mid - 1;
                continue;
            } else if (arrayList[mid] < numberToFind) {
                System.out.println("Not found on Position: " + mid);
                left = mid + 1;
                continue;
            }
        }

        System.out.println("Number not found in the list that was given");
    }

}
