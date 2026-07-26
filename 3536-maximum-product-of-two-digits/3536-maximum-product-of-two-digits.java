class Solution {
    public int maxProduct(int n) {
        String str=Integer.toString(n);

        char m[]=str.toCharArray();

        Arrays.sort(m);
        int l=m.length;
        return (m[l-1]-'0')*(m[l-2]-'0');
    }
}