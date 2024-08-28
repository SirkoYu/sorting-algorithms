import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 4, 3};
        System.out.println(STR."Array: \{Arrays.toString(array)}");
        System.out.println(SortingAlgorithms.isSorted(array) ? "Array is sorted." : "Array is not sorted.");
        SortingAlgorithms.bogoSorting(array);
        System.out.println(STR."Array: \{Arrays.toString(array)}");
        System.out.println(SortingAlgorithms.isSorted(array) ? "Array is sorted." : "Array is not sorted.");
    }
}