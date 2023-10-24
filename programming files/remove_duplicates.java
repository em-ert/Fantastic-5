import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* This class will remove the duplicates from a list

*/
public class remove_duplicates {

    /**
    * This removes the duplicates from a list
    * @param arr is a List of intergers that are to be removed
    * @param removedElements is a list of ints removed from arr
    * @return returns a list of intergers with no duplicates
    */
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            } else {
                removedElements.add(arr.get(i));
            }
        }
        return uniqueArr;
    }
    
    //Main function
    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
