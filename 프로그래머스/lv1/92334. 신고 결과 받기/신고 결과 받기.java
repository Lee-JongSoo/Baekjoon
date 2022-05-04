import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> iMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            iMap.put(name, i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String reportFrom = str[0];
            String reportTo = str[1];
            map.get(reportTo).add(reportFrom);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reportSend = map.get(id_list[i]);
            if (reportSend.size() >= k) {
                for (String name : reportSend) {
                    answer[iMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}
