class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int ar[]=arr.clone();

        Arrays.sort(ar);
        int rank=1; 
        for(int a:ar) {
            if(!map.containsKey(a)) {
                map.put(a,rank++);
            }
        }

        for(int a=0;a<arr.length;a++){
            arr[a]=map.get(arr[a]);
        }
        return arr;
    }
}