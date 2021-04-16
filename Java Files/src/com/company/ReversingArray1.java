package com.company;

public class ReversingArray1 {
    public static void main(String[] args){
        int Array[]={1,2,3,4,5};
        int revArr[]=new int[5];
        for (int i = Array.length-1, j = 0; i >=0 && j < Array.length; i--, j++){
            revArr[j]=Array[i];
            System.out.println(revArr[j]);
        }
    }
}
