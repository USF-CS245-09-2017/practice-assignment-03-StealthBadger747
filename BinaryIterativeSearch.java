/* Erik Parawell - 20477737 */

public class BinaryIterativeSearch implements Practice03Search {

    @Override
    public String searchName() {
        return "binary-iterative";
    }

    @Override
    public int search(int[] arr, int target) {
        /* Set my variables for the bounds */
        int upperBound = arr.length - 1;
        int lowerBound = 0;

        /* This splits the array continuously until it finds it or it doesn't so return -1 */
        while (lowerBound < upperBound) {
            int middle = (lowerBound + upperBound)/2;
            if(arr[middle] == target) {
                return middle;
            }
            else if(arr[middle] < target) {
                lowerBound = middle +1;
            }
            else {
                upperBound = middle - 1;
            }
        }
        return -1;
    }
}