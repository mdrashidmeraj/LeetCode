public class Solution {
	public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        helper(0, a, new ArrayList<>(), ans);
        return ans;
	}
    void helper(int idx, String a, ArrayList<String> asf, ArrayList<ArrayList<String>> ans){
        if(idx == a.length()){
            ans.add(new ArrayList<>(asf));
            return;
        }
        for(int i = idx; i<a.length(); i++){
            if(isPallindrome(a,idx,i)){
                asf.add(a.substring(idx,i+1));
                helper(i+1,a,asf,ans);
                asf.remove(asf.size()-1);
            }
        }
    }
    boolean isPallindrome(String a,int  i,int j){
        while(i<=j){
            if(a.charAt(i) != a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
