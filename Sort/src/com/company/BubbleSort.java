package com.company;

public class BubbleSort {
    int Array[]={3,6,2,8,3,1,3,2};
    int size = Array.length;
    int i,j;
   public void bubbleSort(int arr[], int n){
        for (i=0;i<n-1;i++){// no. of passes
            int flag = 0; //Adaptiveness check
            for(j=0;j<n-1-i;j++){//swapping of elements

                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
               flag=1;
            }
            if (flag==0)
                break;
     }
    }//Bubble Sort

    public static void main(String[] args){
       BubbleSort Sort = new BubbleSort();
       Sort.bubbleSort(Sort.Array,Sort.size);
       for (int i=0;i<Sort.size;i++) {
           System.out.print(Sort.Array[i]+" ");
       }
    }
}
