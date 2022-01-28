package com.devjenni.thisiscodingtest.sorting;

/*
    [퀵 정렬]
    기준 데이터를 설정하고 큰 수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식을 반복
    피벗 사용(보통 첫번째 데이터가 피벗으로 사용됨)
    가장 많이 사용되는 정렬 중 하나로 속도가 빠름
 */
public class 퀵정렬 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 9, 1};
        quickSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void quickSort(int arr[], int start, int end) {
        if(start >= end) return;
        int pivot = start;      // 피벗은 가장 앞에 있는 데이터
        int left = start+1;     // 시작은 피벗 다음 데이터
        int right = end;        // 끝

        // 왼쪽 포인터가 오른쪽 포인터보다 클 때까지
        // 두 개가 교차될 때까지
        while(left <= right) {
            while(left <= end && arr[pivot] >= arr[left]) left++;       // 피벗 데이터보다 큰 수 찾기
            while(right > start && arr[pivot] <= arr[right]) right--;   // 피벗 데이터보다 작은 수 찾기

            // 두 개가 교차했을 경우
            if(left > right) {
                // 교환
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            } else {
                // 교환
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // 반씩 나눠서 quick정렬 다시 호출
        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);
    }
}
