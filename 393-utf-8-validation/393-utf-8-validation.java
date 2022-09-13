class Solution {
    public boolean validUtf8(int[] data) {
        int skips = 0;
        for(int n: data){
            if(skips == 0){
                if(n>>7 == 0b0){
                    skips = 0;
                }else if((n>>5) == 0b110){
                    skips = 1;
                }else if((n>>4) == 0b1110){
                    skips = 2;
                }else if((n>>3) == 0b11110){
                    skips = 3;
                }else return false;
            }else{
                if((n>>6) == 0b10) skips--;
                else return false;
            }
        }
        if(skips == 0) return true;
        return false;
    }
}