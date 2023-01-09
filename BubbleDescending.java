public class BubbleDescending {
    public static void main(String[] args) {
        int arr[] = {3,2,7,5,6,1,4};
        int n = arr.length;

        // Array Before Bubble Sort
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Logic of Bubble Sort
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i) ; j++) {
                if(arr[j-1]<arr[j]){
                    // swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        // Array After Bubble Sort
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
