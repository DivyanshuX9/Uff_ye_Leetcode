class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int nums[]={0,1,2,3,4,5,6,7,8,9};
        int r=9;
        StringBuilder str=new StringBuilder();
        if(sum>9*num) return "";
        for(int a=0;a<num;){
            if(sum-nums[r]>=0){
                str.append(nums[r]);
                a++;
                sum-=nums[r];
                if(sum==0){
                    while(a<num){
                        str.append(0);
                        a++;
                    }
                    break;
                }
            }else{
                r--;
            }
        }
        return str.toString();
    }
}