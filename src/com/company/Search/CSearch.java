package com.company.Search;

public class CSearch {
    public static void main(String args[]){
        int a[] = {1,4,19,23,66};
        int x = 19;

        int index = linear(a, x);
        int index2 = binary(a, x);
        System.out.println(index2);
    }
    public static int linear(int a[], int b){
        int index = 0;
        for(int i = 0; i < a.length;i++){
            if(a[i] == b) {
                index = i;
            }
        }
        return index;
    }

    public static int[] sort(int a[]){

        for(int i = 0;i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int temp = i;
                    i = j;
                    j = temp;
                }
            }
        }
        return a;
    }
    public static int binary(int a[], int b){

        int newArray[] = sort(a);

        int l = 0;
        int r = newArray.length - 1;
        int m;
        while(l <= r){
            m = l + (r - l) / 2;

            if(newArray[m] == b){
                return m;
            }
            else if(newArray[m] < b){
                l = m + 1;
            }
            else{
                l = m - 1;
            }
        }
        return -1;
    }
}
