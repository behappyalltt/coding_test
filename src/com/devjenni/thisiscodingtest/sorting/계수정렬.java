package com.devjenni.thisiscodingtest.sorting;

/*
    [계수 정렬]
    특정한 조건이 부합할 때만 사용 가능
    조건: 데이터의 크기 범위가 제한되어 정수 형태로 표현이 가능할 때만
    속도가 매우 빠름
 */
public class 계수정렬 {
    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < arr.length; i++) {
            // 각 데이터에 해당하는 인덱스의 값 증가
            cnt[arr[i]] += 1;
        }

        // 배열에 기록된 정렬 정보 확인
        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                // 띄어쓰기를 기준으로 등장한 횟수만큼 인덱스 출력
                System.out.print(i + " ");
            }
        }
    }
}
