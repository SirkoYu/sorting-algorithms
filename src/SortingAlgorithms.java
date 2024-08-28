import java.util.ArrayList;
import java.util.List;
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
            int j = random.nextInt(i + 1);
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
    /**
     * Sorts the given array in ascending order using the selection sort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void selectionSorting(int[] array){
        int attempts = 0;
        for (int i = 0; i < array.length-1; i++) {
            attempts++;
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                attempts++;
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(STR."Attempts: \{attempts}");
    }
    public static List<Integer> quickSorting(List<Integer> list){
        if(list.size() <= 1)
            return list;
        List<Integer> lessThenPivot = new ArrayList<>();
        List<Integer> greaterThenPivot = new ArrayList<>();
        Integer pivot = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) <= pivot){
                lessThenPivot.add(list.get(i));
            } else {
                greaterThenPivot.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(quickSorting(lessThenPivot));
        list.add(pivot);
        list.addAll(quickSorting(greaterThenPivot));
        return list;
    }
}
