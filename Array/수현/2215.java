class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> temp1 = new HashSet<>();
        Set<Integer> temp2 = new HashSet<>();

        for (int i=0; i<nums1.length; i++){
            temp1.add(nums1[i]);
        }

        for (int i=0; i<nums2.length; i++){
            temp2.add(nums2[i]);
        }

        List<Integer> diff1 = new ArrayList<>(temp1);
        diff1.removeAll(temp2);
        List<Integer> diff2 = new ArrayList<>(temp2);
        diff2.removeAll(temp1);

        answer.add(diff1);
        answer.add(diff2);

        return answer;
    }
}
