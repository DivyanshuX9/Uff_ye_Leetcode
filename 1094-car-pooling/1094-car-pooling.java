class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Arrays.sort(trips,(a,b)->Integer.compare(a[1], b[1]));
        // System.out.println(trips[trips.length-1][2]);
        int[] timeline=new int[100000];

        for(int a[]:trips){
            timeline[a[1]]+=a[0];
            timeline[a[2]]-=a[0];
            if(timeline[a[1]]>capacity) return false;
            int x=a[1]+1;
            while(x<=a[2]){
                timeline[x++]+=a[0];
                if(timeline[x-1]>capacity) return false;
            } 
        }
        // for(int a:timeline) System.out.println(a);
        return true;
    }
}