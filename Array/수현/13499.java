class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int total = 0;
        for (String b : babbling){
            for (String word : words){
                if (b.indexOf(word+word)!=-1){
                    break;
                }
                b=b.replace(word,"0");
            }
            if (b.matches(".*[a-z].*")){
                continue;
            }
            total+=1;
        }
        return total;
    }
}
