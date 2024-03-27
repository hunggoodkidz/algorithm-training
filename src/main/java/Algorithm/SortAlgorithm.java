package Algorithm;

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

//        mergeShit(arr);
//        System.out.println();
//        System.out.print("Merge Sort:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
    }


    public static void insertionSorting(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void mergeShit(int[] arr){
        int n = arr.length;

        if(n <= 1){
            return;
        }
        int mid = n/2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        mergeShit(left);
        mergeShit(right);

        merge2(arr,left,right);

    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return; // Array is already sorted
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Split the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    public static void merge2(int[] arr, int[] left, int[] right){
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
    public static void merge(int[] arr, int[] left, int[] right){
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0 , k = 0;

        while (i < n1 && j < n2){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
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
            quickSort(arr,low,pivotIndex - 1);
            quickSort(arr,pivotIndex + 1,high);
        }

    }

    public static int partition(int[] arr, int low, int high) {
        // Lấy pivot là index mảng cuối cùng
        // partition là vách ngăn
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i + 1,high);
        return i + 1;
    }


    public static int insert(int arr[], int low ,int high){

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[i] > arr[j]){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i + 1, high);
        return i + 1;
    }

    public static void insertionShit(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
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
//    public static void simpleSort(int arr[]){
//        //int[] arr = {5, 2, 3, 4, 1};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    swap(arr,i,j);
//                }
//            }
//        }
//    }

    // for (int i = 0; i < arr.size(); i++) {
    //     for (int j = i + 1; j < arr.size(); j++) {
    //         if(arr.get(i) > arr.get(j)){
    //             int temp = arr.get(i);
    //             arr.set(i, arr.get(j));
    //             arr.set(j, temp);
    //         }
}
