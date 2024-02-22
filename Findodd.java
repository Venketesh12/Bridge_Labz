package Bridge_Labz;
public class Findodd {
    public static void printOdd(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {21, 43, 76, 12, 99};
        printOdd(arr);
    }
}
