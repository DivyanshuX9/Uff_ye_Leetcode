class Solution {
    public String smallestPalindrome(String s) {
        int fq[]=new int[26];
        for(char m:s.toCharArray()) fq[m-'a']++;

        StringBuilder front=new StringBuilder();
        char mid=' ';
        for (int a = 0; a < 26; a++) {
            int count = fq[a];
            int pairs = count/2;
            for (int i = 0; i < pairs; i++) front.append((char)('a' + a));
            fq[a] = count%2;
            if (fq[a] == 1) {
                mid = (char)('a' + a);
            }
        }
        String x=front.reverse().toString();
        front.reverse();
        if(mid==' ') return front.append(x).toString();
        return (front.append(mid).append(x)).toString();
    }
}