package DataStructure;

public class SortAlgorithm {

    public static void main(String[] args){
        int[] arr = {5, 2, 3, 4, 1};
        System.out.print("Original Array: ");
        for (int num1: arr) {
            System.out.print(num1 + " ");
        }

//        simpleSort(arr);
//        System.out.print("Simple Sort: ");
//        for (int num: arr) {
//            System.out.print(num + " ");
//        }
//
//        bubbleSort(arr);
//        System.out.println();
//        System.out.print("Bubble Sort: ");
//        for (int num: arr) {
//            System.out.print(num + " ");
//        }
//
//        selectionSort(arr);
//        System.out.println();
//        System.out.print("Selection Sort: ");
//        for (int num: arr) {
//            System.out.print(num + " ");
//        }

        insertionSort(arr);
        System.out.println();
        System.out.print("Insertion Sort: ");
        for (int num: arr) {
            System.out.print(num + " ");
        }

//        quickSort(arr, 0, arr.length - 1);
//        System.out.print("Quick Sort:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
    }

    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        //Quick sort is the fastest sort in Sort Algorithm
        // 3 steps
        // Step 1 : Choose one of the number of Array as a pivot
        //Correct position in final, sorted array
        //Items to the left are smaller
        //Items to the right are bigger
        if (low < high) {
            // pivot là trục xoay
            int pivotIndex = partition(arr, low, high);
            //recursion - đệ quy
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    public static int parttiton2(int[] arr, int low, int high){
        // Lấy pivot là index mảng cuối cùng
        // partition là vách ngăn
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(arr[i] > arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i  + 1;
    }
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void insertionSort(int arr[]){

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while( j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

    }

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minofIndex = i;
            for (int j = i + 1; j < n ; j++) {
                if(arr[i] > arr[j]){
                    minofIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minofIndex];
            arr[minofIndex] = temp;
        }
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0 ; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void simpleSort(int arr[]){
        //int[] arr = {5, 2, 3, 4, 1};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i +1 ; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }
}
