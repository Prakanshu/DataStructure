package Sorting;

public class SelectionSort{

    public static void main(String[] args) {
        int []arr={12,20,20,20,24,1,566,867,65,0};
       arr= selectionSort(arr);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] +"\t");
       }
    }

    private static int[] selectionSort(int[]arr)
    {
        int length=arr.length; // find length of the array
        for(int i=0;i<length;i++){
            int min=arr[i]; // assume a[i] as minimum
            // compare min with a[i+1] or a[j]
            for(int j=i+1;j<length;j++){
                // continue if minimum is less than subsequent elements of array
                if(min<arr[j]) {
                    continue;
                }
                // if found any element of array less than minimum,make it as a new minimum
               else{
                   min=arr[j];
                }
               // swap minimum with current element of array
                int temp=arr[i];
                arr[i]=min;
                arr[j]=temp;
            }
        }



        return arr;
    }

}