class Solution {
    public int addDigits(int num) {
//         My approach working
        // int sum = 0;
        // while(num>9){
        //     sum =0;
        //     while(num>0){
        //         int d = num%10;
        //         sum+=d;
        //         num/=10;
        //     }
        //     num = sum;
        // }
        // return num;

        //o(1) approach
        
        if(num == 0) return 0;
        if(num%9 == 0) return 9;
        return num%9;
        
    }
}