class Solution {
    public boolean checkString(String s) {
        int flag=0;
        for(int a=0;a<s.length();a++){
            if(s.charAt(a)=='b') flag=1;
            if(flag==1 && s.charAt(a)=='a') return false;
        }
        return true;
    }
}