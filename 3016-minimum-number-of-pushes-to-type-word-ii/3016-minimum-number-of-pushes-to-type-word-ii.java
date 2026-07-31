class Solution {
    public int minimumPushes(String word) {
        int ch[]=new int[26];
        for(char m:word.toCharArray()){
            ch[m-'a']++;
        }
        int size=0;
        for(int a=0;a<26;a++){
            if(ch[a]!=0) size++;
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int a: ch){
            if(a!=0) maxheap.add(a);
        }
        int s=0;
        int count=0;
        for(int a=0;a<size;a++){
            if(a%8==0) s++;
            count+=s*maxheap.poll();
        }
        return count;
        
    }
}