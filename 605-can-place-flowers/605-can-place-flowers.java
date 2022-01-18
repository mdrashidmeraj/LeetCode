class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int i = 0;
        int s = flowerbed.length;
        while(i<s){
            if(flowerbed[i] == 1){
                i+=2;
                continue;
            }
            if(i>0 && i<s-1){
                if(flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
                    n--;
                    flowerbed[i] = 1;
                    i+=2;
                    continue;
                }
            }else{
                if(i==0 && i==s-1){
                   n--;
                    flowerbed[i] = 1;
                    i+=2;
                    continue;
                }else{
                    if(i == 0 && flowerbed[i+1] != 1){
                        n--;
                        flowerbed[i] = 1;
                        i+=2;
                        continue;
                    }
                    else if(i == s-1 && flowerbed[i-1] !=1){
                        n--;
                        flowerbed[i] = 1;
                        i+=2;
                        continue;
                    }
                }
            }
            i++;
            
        }
        if(n<=0) return true;
        else return false;
    }
}