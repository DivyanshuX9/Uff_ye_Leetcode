class Solution {
public:
    int hammingWeight(int n) {
        long s=0;
        for(int a=0;s<=n && a<n;a++){
                s=pow(2,a);
        }
        if(s!=n) s/=2;
        int count=0;
        for(int a=s;n!=0;a/=2){
            if(a<=n){
                n-=a;
                count++;
            }
            printf("%d %d",n,a);
        }
        return count;
    }
};