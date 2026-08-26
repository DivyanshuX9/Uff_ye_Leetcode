class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0;
        int r = 0;

        int count = 0;
        int min = Integer.MAX_VALUE;
        String str = "";
        while (l <= r && r < s.length()) {
            char m = s.charAt(r);
            if (m == '1')
                count += 1;
            System.out.println(count + " " + min);
            while (count >= k) {
                String cur=s.substring(l,r+1);
                if (count == k &&
                    (str.equals("") ||
                     cur.length() < str.length() ||
                     (cur.length() == str.length() && cur.compareTo(str) < 0))) {

                    min = r - l;
                    str = cur;
                    System.out.println(str);
                }
                if (s.charAt(l) == '1') count -= 1;
                l++;
            }
            r++;
        }
        return str;
    }
}