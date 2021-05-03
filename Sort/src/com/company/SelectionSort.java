package com.company;
public class SelectionSort {

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


//    public void SelectionSort(int A[], int n){
//        int i,j,min;
//        for (i=0;i<n-1;i++){
//            for (j=min=i;j<n;j++){
//                if (A[j]<A[min]){
//                    min=j;
//                }
//                swap(A,i,min);
//            }
//        }
//
//    }

    public void SelectionSort(int A[], int n){
        int min;
        for (int i = 0; i<n-1; i++){ //n-1 because last element has no one to compare itself with
            min = i; // assuming min element to be at index i
            for(int j=i+1; j<n; j++){
               if (A[j]<A[min]){
                   swap(A,j,min);
               }
            }
        }
    }


    //Driver Code
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int Array[]={3,3,24, 2400,5,2,0,45,5,6300,10,1,1,1,1};
        int n = Array.length;
        sort.SelectionSort(Array,n);
        sort.display(Array,n);

    }

}

