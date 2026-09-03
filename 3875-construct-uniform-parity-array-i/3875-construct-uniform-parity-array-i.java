class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd=false;
        boolean even=false;

        for(int a:nums1){
            if(a%2==0) even=true;
            else odd=true;  
        }
        return even==odd || (odd && !even) || (!odd && even);
    }
}