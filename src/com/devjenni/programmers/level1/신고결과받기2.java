package com.devjenni.programmers.level1;

import java.util.*;

/*
    [신고 결과 받기] - 카카오
    신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

    1. 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
    2. 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
    3. 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
    4. k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
    5. 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.

    id_list	                                 report                                                                 k	    result
    ["muzi", "frodo", "apeach", "neo"]	    ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]      2	    [2,1,1,0]
    ["con", "ryan"]	                        ["ryan con", "ryan con", "ryan con", "ryan con"]	                    3	    [0,0]
 */
public class 신고결과받기2 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> report_member = new HashMap<>();   // 해당 유저(key)를 신고한 다른 유저들(value/HashSet -> 중복 X)

        for(String id: id_list) report_member.put(id, new HashSet<String>());

        // 해당 유저를 신고한 다른 유저 add하기
        for(String rep: report) {
            String rep_arr[] = rep.split(" ");
            report_member.get(rep_arr[1]).add(rep_arr[0]);
        }

        // k보다 신고를 많이 당했으면 그 유저를 신고한 유저id의 index 찾아서 해당 값 +1 해주기
        for(String key: report_member.keySet()) {
            HashSet<String> reporters = report_member.get(key);
            if(reporters.size() >= k) {
                for(String reporter: reporters) {
                    int index = Arrays.asList(id_list).indexOf(reporter);
                    answer[index]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String id_list[] = {"muzi", "frodo", "apeach", "neo"};
        String report[] = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        System.out.println(solution(id_list, report, 2));
    }
}
