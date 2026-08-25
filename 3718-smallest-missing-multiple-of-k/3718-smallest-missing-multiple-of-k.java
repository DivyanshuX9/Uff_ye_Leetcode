class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> gg=new HashSet<>();
        for(int a:nums){
            if(a%k==0) gg.add(a);
        }
        int a=1;
        // System.out.println(gg.size());
        for(;a<=nums.length;a++){
            // System.out.println(a+" "+k);
            if(!gg.contains(k*a)){
                return k*a;
            }
        }
        return (gg.size()+1)*k;
    }
}