class Solution {
public:
    bool sumGame(string num) {
        int q1=0,q2=0;
        int s1=0,s2=0;
        int l=num.length();
        for(auto a=0;a<l;a++){
            if(a>=l/2){
                if(num[a]=='?') q2++;
                else s2+=num[a]-'0';
            }else{
                if(num[a]=='?') q1++;
                else s1+=num[a]-'0';
            }
        }

        // if(q1==0 && q2==0 && s1!=s2) return true;
        if ((q1 + q2) % 2)
            return true;
        return (s1-s2)!=(q2-q1)*9/2;
    }
};