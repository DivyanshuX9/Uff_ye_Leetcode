class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int l=nums[0];
        int s=nums[0];

        for(int a=0;a<nums.length;a++){
            if(l<nums[a]) l=nums[a];
            if(s>nums[a]) s=nums[a];
        }
        System.out.println(l+" "+s);
        return gcd(l,s);
    }
}