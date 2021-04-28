package com.company;

public class InsertionSort {
    int Array[]={2,4,35,3,0};
    int size = Array.length;
    int i,j,x;
    public void InsertSort(int arr[], int n) {
        for (i = 0; i < n; i++) {
            for (j = 1; j < n; j++) {
                x = j - 1;
                if (arr[x] > arr[j]) {
                    int temp = arr[x];
                    arr[x] = arr[j];
                    arr[j] = temp;
                    x++;
                    i++;
                }
            }
        }
    }
public static void main(String[] args){
        InsertionSort sort = new InsertionSort();
        sort.InsertSort(sort.Array,sort.size);
    for (int i=0;i<sort.size;i++) {
        System.out.print(sort.Array[i]+" ");
    }
    }
}
