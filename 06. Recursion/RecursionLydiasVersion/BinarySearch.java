package RecursionLydiasVersion;

public class BinarySearch {
    //what does binary search do again?
    //do i return an index or do i return a boolean
    //if it's not there return -1 if it's there return the index?
    public static int binarySearch(int[] arr, int key) {

    }
    private static int binarySearchRecursive(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }else if (arr[mid] < key) {
            return binarySearchRecursive(arr, key, mid + 1, high);
        } else if (arr[mid] > key) {
            return binarySearchRecursive(arr, key, low, mid - 1);
        }
    }
}
