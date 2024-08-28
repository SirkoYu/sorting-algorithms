import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        List<Integer> list = new ArrayList<>();
        for (int num: array){
            list.add(num);
        }
        System.out.println(STR."Array: \{Arrays.toString(array)}");
        System.out.println(STR."List: \{list}");

        System.out.println(SortingAlgorithms.isSorted(array) ? "Array is sorted." : "Array is not sorted.");

        System.out.println("Bogo Sorting");
        SortingAlgorithms.bogoSorting(array);
        System.out.println(STR."Array: \{Arrays.toString(array)}");
        System.out.println(SortingAlgorithms.isSorted(array) ? "Array is sorted." : "Array is not sorted.");

        SortingAlgorithms.shuffleArray(array);
        System.out.println(STR."Array: \{Arrays.toString(array)}");

        System.out.println("Selection Sorting");
        SortingAlgorithms.selectionSorting(array);
        System.out.println(STR."Array: \{Arrays.toString(array)}");
        System.out.println(SortingAlgorithms.isSorted(array) ? "Array is sorted." : "Array is not sorted.");

        System.out.println("Quick Sorting");
        SortingAlgorithms.quickSorting(list);
        System.out.println(STR."List: \{list}");
    }
}