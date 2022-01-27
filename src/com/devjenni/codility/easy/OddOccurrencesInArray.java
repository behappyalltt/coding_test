package com.devjenni.codility.easy;

import java.util.ArrayList;
import java.util.HashSet;

/*
    https://app.codility.com/demo/results/trainingR7UA35-KZU/
 */
public class OddOccurrencesInArray {
    public static int oddOccurrencesInArraySolution(int[] A) {
        HashSet<Integer> chkPair = new HashSet<>();

        for(int i=0; i<A.length; i++) {
            if(chkPair.contains(A[i])) chkPair.remove(A[i]);
            else chkPair.add(A[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>(chkPair);
        return ans.get(0);
    }

    public static void main(String[] args) {
        int array[] = {3, 6, 7, 10, 10, 6, 3};

        oddOccurrencesInArraySolution(array);
    }
}
