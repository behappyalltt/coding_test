package com.devjenni.thisiscodingtest.sorting;

/*
    [선택 정렬]
    가장 작은 수를 찾아 맨 앞에 있는 데이터와 바꾸고
    그다음 작은 수를 찾아 두 번째 데이터와 바꾸는 정렬
 */
public class 선택정렬 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 9, 1};
        selectionSort(arr);

        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            // 가장 작은 수의 index
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIdx] > arr[j]) minIdx = j;
            }

            // 교환
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}