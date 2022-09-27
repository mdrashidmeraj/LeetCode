class Solution {
    public String pushDominoes(String dominoes) {
        char[] ch = dominoes.toCharArray(); 
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<ch.length; i++){
            if(ch[i] == '.') continue;
            q.add(i);
        }
        while(q.size()>0){
            int idx = q.remove();
            if(ch[idx] == 'L'){
                if(idx-1>=0 && ch[idx-1] == '.'){
                    ch[idx-1] = 'L';
                    q.add(idx-1);
                }
            }
            else if(ch[idx] == 'R'){
                if(idx+1<ch.length && ch[idx+1] == '.'){
                    if(idx+2<ch.length && ch[idx+2] == 'L'){
                        q.remove();
                    }else {
                        ch[idx+1] = 'R';
                        q.add(idx+1);
                    }
                }        
            }
        }
        
        return new String(ch);
    }
}