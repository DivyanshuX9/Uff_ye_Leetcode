class Solution {
    public int lumsum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int a=0;a<n;a++){
            if(lumsum(nums[a])==a) return a;
        }
        return -1;
    }
}