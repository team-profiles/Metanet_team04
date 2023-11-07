import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            boolean toDelete = false;

            for (int deleteNum : delete_list) {
                if (num == deleteNum) {
                    toDelete = true;
                    break;
                }
            }

            if (!toDelete) {
                resultList.add(num);
            }
        }

        // ArrayList를 배열로 변환
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
