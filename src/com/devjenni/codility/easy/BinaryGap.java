package com.devjenni.codility.easy;

import java.util.ArrayList;
import java.util.List;

/*
    https://app.codility.com/demo/results/trainingD3DNS7-VNE/
 */
public class BinaryGap {
    public static int binaryGapSolution(int N) {
        String binaryString = Integer.toBinaryString(N);
        List<Integer> idxList = new ArrayList<>();

        int idx = binaryString.indexOf("1");
        while(idx != -1) {
            idxList.add(idx);
            idx = binaryString.indexOf("1", idx+1);
        }

        if(binaryString.lastIndexOf("0") == binaryString.length()-1
                && idxList.size() > 1) {
            idxList.add(binaryString.length()-1);
        }

        int maxLength = 0;
        for(int i=0; i<idxList.size()-1; i++) {
            int length = idxList.get(i+1) - idxList.get(i);

            if(maxLength < length) maxLength = length;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("N " + binaryGapSolution(1041));
    }
}
