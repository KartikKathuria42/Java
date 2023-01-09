import java.util.*;

public class BS {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + end/2;
            if(ele == a[mid]){
                System.out.println(mid);
                break;
            } else if(ele <= a[mid]){
                end = mid-1;
            } else if(ele >= a[mid]){
                start = mid+1;
            } else{
                System.out.println("Search Unsuccesful");
            }
        }
        sc.close();
    }
}
