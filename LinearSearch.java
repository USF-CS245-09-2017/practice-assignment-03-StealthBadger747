/* Erik Parawell - 20477737 */

public class LinearSearch implements Practice03Search{

    @Override
    public String searchName() {
        return "linear";
    }

    @Override
    public int search(int[] arr, int target) {
        /* Check each index until we find it or return -1 if we don't */
        for (int i=0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
