package Bridge_Labz;
public class Duplicate {
    public static void printDuplicate(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[j] != arr[i]){
                    arr[i] = arr[j];
                }else{
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 23, 45, 45, 78};
        printDuplicate(arr);
    }
}


/*
 * searching techniques
Linear Search
Binary search
Sorting Techniques
Bubble Sort
Selection Sort
Insertion Sort
Shaikh Shahazad
1:14 PM
Implement the Above Programs using the Searching ans Sorting techniques
Understanding is : Merge, Quick, LinkedList, Stack and queue
 */