package com.company;

//First Approach
//public class ReversingArray1 {
//    public static void main(String[] args){
//        int Array[]={1,2,3,4,5};
//        int revArr[]=new int[5];
//        for (int i = Array.length-1, j = 0; i >=0 && j < Array.length; i--, j++){
//            revArr[j]=Array[i];
//            System.out.println(revArr[j]);
//        }
//    }
//}

//Second Approach
class Array{
    int arr[] = {1,2,3,4,5};
    int size;
    int length;
    int i,j;

    //Display Array Function
    public void DisplayArray(int array[], int length){
        for (i=0;i<length; i++){
            System.out.print(array[i]+" ");
        }
    }

    //Reversing an Array Function
    public void ReverseArray(int arr[], int length){
        int revArr[]=new int[5];
        for (i = arr.length-1, j = 0;i>=0&&j<arr.length;i--,j++){
            revArr[j]=arr[i];
            System.out.print(revArr[j]+" ");
        }
    }

}

//Driver Code
public class ReversingArray1{
    public static void main(String[] args){

        Array struct = new Array();
        struct.DisplayArray(struct.arr, struct.arr.length);
        System.out.println();
        struct.ReverseArray(struct.arr, struct.arr.length);

    }
}