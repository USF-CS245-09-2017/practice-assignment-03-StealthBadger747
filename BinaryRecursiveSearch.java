/* Erik Parawell - 20477737 */

public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "binary-recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        return binaryRecSearch(arr, target, 0, arr.length-1);
    }

    private int binaryRecSearch(int[] arr, int target, int low, int upper) {
        if(low > upper) {
            return -1;
        }
        int middle = (low + upper)/2;

        /* We found it so return it */
        if(arr[middle] == target) {
            return middle;
        }
        else if(target < arr[middle]) {
            middle -= 1;
            return binaryRecSearch(arr, target, low, middle);
        }
        else {
            middle += 1;
            return binaryRecSearch(arr, target, middle, upper);
        }
    }
}
