package Algorithm;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40};
        int target = 20;

        int linearResult = linearSearch(arr, target);
        int binaryResult = binarySearch(arr, target);

        if (linearResult != -1) {
            System.out.println("Linear Search: Target " + target + " found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Target " + target + " not found in the array.");
        }

        if (binaryResult != -1) {
            System.out.println("Binary Search: Target " + target + " found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Target " + target + " not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found at index 'i'
            }
        }
        return -1; // Target not found in the array
    }


    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index 'mid'
            } else if (arr[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found in the array
    }

    public static int binarySearch(int[] arr, int target) {
        int left =0 ;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
