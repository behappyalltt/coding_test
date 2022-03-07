package com.devjenni.codility.hard;

public class sb {
    public static String sbSolution(String S) {
        String removeStr[] = {"AB", "BA", "CD", "DC"};

        String str = (S == null) ? "" : S;
        while(true) {
            String tempS = str;
            for(int i=0; i<removeStr.length; i++) {
                if(tempS.contains(removeStr[i])) {
                    tempS = tempS.replaceAll(removeStr[i], "");
                    break;
                }
            }

            if(!tempS.equals(str)) str = tempS;
            else break;
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(sbSolution("ACDACBD"));
        System.out.println(sbSolution("CBACD"));
        System.out.println(sbSolution("CABABD"));
        System.out.println(sbSolution(""));
        System.out.println(sbSolution(null));
    }
}
