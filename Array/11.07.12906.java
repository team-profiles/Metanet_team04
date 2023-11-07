import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // 현재 원소와 다음 원소가 다를 때만 결과에 추가
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                resultList.add(arr[i]);
            }
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
