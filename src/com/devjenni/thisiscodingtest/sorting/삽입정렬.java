package com.devjenni.thisiscodingtest.sorting;

/*
    [삽입 정렬]
    특정 데이터를 적절한 위치에 삽입
    index를 하나씩 증가시키면서 그 위치에 있던 데이터가 이미 정렬된 앞 데이터들과 비교하여 본인 위치를 찾음
    데이터가 거의 정렬되어 있을 때 효율적
 */
public class 삽입정렬 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 9, 1};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void insertionSort(int arr[]) {
        // 1부터 배열 끝까지
        for(int i=1; i<arr.length; i++) {
            // i부터 1까지
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j - 1]) {
                    // 교환
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }
        }
    }
}
