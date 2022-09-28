class Solution {
    public String countAndSay(int n) {
        String val = "1";
        while(n-- != 1){
            char ch = val.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();
            int j = 1;
            for(; j<val.length(); j++){
                if(val.charAt(j) == ch){
                    count+=1;
                }else{
                    sb.append(count);
                    sb.append(ch);
                    count = 1;
                    ch = val.charAt(j);
                }
            }
            sb.append(count);
            sb.append(ch);
            val = sb.toString();
        }
        return val;
    }
}