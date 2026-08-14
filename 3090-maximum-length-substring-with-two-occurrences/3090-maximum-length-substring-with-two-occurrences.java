class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        Map<Character,Integer> gg=new HashMap<>();
        int max=0;

        for(int a=0;a<s.length();a++){
            int count=gg.getOrDefault(s.charAt(a),0)+1;
            gg.put(s.charAt(a),count);
                while(gg.get(s.charAt(a))>2){
                    gg.put(s.charAt(l),gg.get(s.charAt(l))-1);
                    l++;
                }
                max=Math.max(max,a-l+1);
        }
        return max;
    }
}