class Solution {
    public static void getfactorial(StringBuilder gg,List<Integer> s,int k){
        if(s.size()==0) return;
        int res=1;
          for (int i = 1; i < s.size(); i++) {
            res *= i;
        }

        
        int idx=k/res;
        gg.append(s.get(idx));
        s.remove(idx);
        getfactorial(gg,s,k%res);
    }
    // public static void()
    public String getPermutation(int n, int k) {
        List<Integer> s=new ArrayList<>();
        for(int a=1;a<=n;a++){
            s.add(a);
        }
        StringBuilder gg=new StringBuilder();
        getfactorial(gg,s,k-1);
        // return getPermutation()
        return gg.toString();
    }
}