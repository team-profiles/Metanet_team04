import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> num1 = new ArrayList<>();
        for(int n: nums1) num1.add(n);

        List<Integer> num2 = new ArrayList<>();
        for(int n: nums2) num2.add(n);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        answer.add(new ArrayList<>()); 
        answer.add(new ArrayList<>());

        for(int i=0; i<nums1.length; i++){
            if(!num2.contains(nums1[i])) set1.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(!num1.contains(nums2[i])) set2.add(nums2[i]);
        }

        for(int n: set1) answer.get(0).add(n);
        for(int n: set2) answer.get(1).add(n);

        return answer;
    }
}
