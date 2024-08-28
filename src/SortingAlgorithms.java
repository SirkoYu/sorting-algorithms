public class SortingAlgorithms {

    /**
     * Checks if the given array is sorted in non-decreasing order.
     * This method iterates through the array and compares each pair of adjacent elements.
     * If any element is greater than the next element, the method returns false. Takes O(n) time.
     *
     * @param array the array of integers to check.
     * @return true if the array is sorted in non-decreasing order; false otherwise.
     */
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) return false;
        }
        return true;
    }
}
