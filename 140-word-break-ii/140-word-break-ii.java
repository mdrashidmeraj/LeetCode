class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        helper(s, wordDict, "",0, ans);
        return ans;
    }
    void helper(String s, List<String> wordDict, String asf,int idx, List<String> ans){
        if(idx== s.length()){
            asf = asf.trim();
            ans.add(asf);
            return;
        }
        for(int i = idx; i< s.length(); i++){
            if(isContains(wordDict, s.substring(idx, i+1))){
                asf= asf+" "+s.substring(idx, i+1);
                helper(s, wordDict, asf, i+1, ans);
                asf= asf.substring(0, asf.length()-(i-idx+1)-1);
            }
        }
    }
    boolean isContains(List<String> wordDict, String str){
        for(int i =0;i<wordDict.size(); i++){
            if(str.equals(wordDict.get(i))) return true;
        }
        return false;
    }
    
}