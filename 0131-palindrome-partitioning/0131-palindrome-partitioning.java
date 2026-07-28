class Solution {
    public boolean check(String s,int st,int ed){
        while(st<=ed){
            if(s.charAt(st++)!=s.charAt(ed--)) return false;
        }
        return true;
    }
    public void part(String s,int idx,List<List<String>> gg,List<String> path){
        if(idx==s.length()){
            gg.add(new ArrayList<>(path));
            return;
        }
        for(int a=idx;a<s.length();a++){
            if(check(s,idx,a)){
                path.add(s.substring(idx,a+1));
                part(s,a+1,gg,path);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> gg=new ArrayList<>();
        List<String> path=new ArrayList<>();
        part(s,0,gg,path);
        return gg;
    }
}