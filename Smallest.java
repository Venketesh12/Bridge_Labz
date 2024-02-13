public class Smallest {
    public static int small(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {23, 12, 87, 98, 10};
        System.out.println(small(arr));
    }
}
