/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package pid.exercise.search;
/**
 * The purpose of this class is to provide static methods for searching integer arrays and does not need to be
 * instantiated.
 */
public class Search {

    public static int linearSearch(int[] array, int value){
        for(int i=0;i<array.length;i++){
            if(array [i]  == value){
                return i;
            }
        }
        return -1;
    }

    // Returns index of x if it is present in arr[],
    // else return -1
    public static int binarySearch(int[] array, int value)
    {
        int l = 0;

        int r = array.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (array[m] == value)
                return m;

            // If x greater, ignore left half
            if (array[m] < value)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }



    //optional
    public static int binarySearchRecursive(int[] array, int value){
        return binarySearchRecursiveHelper(array, value, 0, array.length-1);
    }
    public static int binarySearchRecursiveHelper(int[] array, int value, int left, int right) {
        // TODO Implement recursive binary search
        if (left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if (array [mid] == value ) {
            return mid;
        } else if ( value < array[mid]){
            return binarySearchRecursiveHelper(array, value, left, right -1);
        }else {
            return binarySearchRecursiveHelper(array, value, mid +1, right );
        }


    }



}
