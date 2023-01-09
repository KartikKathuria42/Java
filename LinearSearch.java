public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13,19};
        int n = arr.length;
        int key = 13;
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == key){
                System.out.println("Element Found at index " + i);
                break;
            }
        }
        if(i==arr.length)
            System.out.println("Element Not Found");
    }
}