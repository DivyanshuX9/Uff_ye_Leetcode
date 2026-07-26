class Solution {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=max1;
        int max3=max1;
        int min2=Integer.MAX_VALUE;
        int min1=min2;
        for(int digi:nums){
            if(digi>max1){
                max3=max2;
                max2=max1;
                max1=digi;
            }else if(digi>max2){
                max3=max2;
                max2=digi;
            }else if(digi>max3){
                max3=digi;
            }
            if(min1>digi){
                min2=min1;
                min1=digi;
            }else if(min2>digi){
                min2=digi;
            }
        }
        int m=max1*max2*max3;
        int n=min1*min2*max1;

        if(m>n) return m;
        return n;
    }
}