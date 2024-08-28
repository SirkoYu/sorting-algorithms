import java.util.Random;

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
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Generate a random index from 0 to i
            // Swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    /**
     * Sorts an array using the highly inefficient bogo sort algorithm.
     * Bogo sort repeatedly shuffles the array until it is sorted.
     *
     * @param array the array to be sorted
     */
    public static void bogoSorting(int[] array){
        int attempts = 0;
        while (!isSorted(array)){
            shuffleArray(array);
            attempts++;
        }
        System.out.println(STR."Attemps: \{attempts}.");
    }
}
