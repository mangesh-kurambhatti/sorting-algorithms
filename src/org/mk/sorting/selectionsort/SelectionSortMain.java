package org.mk.sorting.selectionsort;

public class SelectionSortMain {
    public static void main(String[] args) {
        System.out.println("========== SELECTION SORT ============");

        //int[] arr = new int[]{5,90,30,4,-2,0,43,28};
        int[] arr = new int[]{20,10,30,5,4};

        for(int i=0;i<arr.length-1;i++){

            int min = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[min]){
                    min=j;
                }
            }
            System.out.println("Smallest element at each pass :"+arr[min]);
            int temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for (int a :arr ) {
            System.out.println(a);
        }
    }
}
