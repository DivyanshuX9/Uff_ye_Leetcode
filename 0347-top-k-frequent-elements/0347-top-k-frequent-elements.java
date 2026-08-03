class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap =new PriorityQueue<>((a, b) -> freq.get(b)-freq.get(a));
        
        int ar[]=new int[k];
        
        for(int num:freq.keySet()){
            heap.offer(num);
        }
        while(k-->0){
            ar[k]=(int)heap.poll();
        }

        return ar;
    }
}