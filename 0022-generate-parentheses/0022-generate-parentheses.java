class Solution {
    List<String> gg=new ArrayList<>();

    public void genpar(int l,int r,StringBuilder str){

        if(l==0 && r==0){
            gg.add(str.toString());
        }
        if(l>0){
            str.append('(');
            genpar(l-1,r,str);
            str.deleteCharAt(str.length()-1);
        }
        if(r>l){
            str.append(')');
            genpar(l,r-1,str);
            str.deleteCharAt(str.length()-1);
        } 

    }
    public List<String> generateParenthesis(int n) {
        StringBuilder str=new StringBuilder();
        genpar(n,n,str);
        return gg;
    }
}