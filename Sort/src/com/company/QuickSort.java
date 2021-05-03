package com.company;
import java.util.*;


public class QuickSort {

    public void swap(int A[], int i, int j){
        int temp;
        temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public void display(int[] A, int n){
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }

   public int Partition(int arr[], int l, int h) {
       int pivot = arr[l];
       int i = l;
       int j = h+1;
       do {
           do {
               i++;
           } while (arr[i] <= pivot);
           do {
               j--;
           } while (arr[j] > pivot);

           if (i < j) {
               swap(arr, i, j);
           }
       }while(i<j);
           swap(arr, l, j);
           return j;
       }

       public void QuickSort(int arr[], int l, int h){
                if (l<h){
                    int pvt = Partition(arr, l, h);
                    QuickSort(arr,l,pvt);
                    QuickSort(arr,pvt+1,h);
                }
       }


    //Driver Code
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int Array[]={3,3,24,52,0,45,5,63,10,65535};
        int n = Array.length;
        sort.QuickSort(Array,0,n-1);
        sort.display(Array,n);
    }

}

