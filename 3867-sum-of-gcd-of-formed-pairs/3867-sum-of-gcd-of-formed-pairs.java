class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int l=0;
        int r=nums.length-1;

        int[] pfg=new int[r+1];
        int m=0;
        int s=0;
        for(int a:nums){
            if(a>m) m=a;
            pfg[s++]=gcd(a,m);
        }
        Arrays.sort(pfg);
        long sum=0;
        while(l<r){
            sum+=gcd(pfg[l],pfg[r]);
            l++;r--;
        }

        return sum;
    }
}