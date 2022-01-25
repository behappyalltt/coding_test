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
public class 신고결과받기1 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<String> new_report = new ArrayList<String>();      // 중복 제거한 새로운 report 리스트
        List<String> only_id = new ArrayList<String>();         // 신고 당한 id

        // new_report에 값 넣기
        for(String r : report) {
            // 중복 제거
            if(!new_report.contains(r)) {
                String ids[] = r.split(" ");
                only_id.add(ids[1]);
                new_report.add(r);
            }
        }

        // 정지 당한 id
        List<String> frozen_ids = new ArrayList<>();
        for(String id : id_list) {
            if(Collections.frequency(only_id, id) >= k) {
                frozen_ids.add(id);
            }
        }

        for(String r : new_report) {
            String ids[] = r.split(" ");
            // 정지 당한 id를 신고한 적 있다면
            if (frozen_ids.contains(ids[1])) {
                // 신고한 id index 찾아서 해당 값 +1 해주기
                int index = Arrays.asList(id_list).indexOf(ids[0]);
                answer[index]++;
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
