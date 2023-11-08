class Solution {
    public int solution(String my_string, String is_prefix) {
        int my_string_index = my_string.length();
        int is_prefix_index = is_prefix.length();
        return  my_string_index > is_prefix_index && my_string.substring(0,is_prefix_index).equals(is_prefix) ? 1 : 0;
    }
}
