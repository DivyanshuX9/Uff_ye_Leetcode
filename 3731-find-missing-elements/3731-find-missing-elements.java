class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();

        for(int a:nums){
            if(a>max) max=a;
            if(a<min) min=a;
            set.add(a);
        }

        List<Integer> gg=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) gg.add(i);
        }
        return gg;
    }
}