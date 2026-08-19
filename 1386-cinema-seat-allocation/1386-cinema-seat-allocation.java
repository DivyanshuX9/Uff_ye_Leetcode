class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            map.computeIfAbsent(seat[0], k -> new HashSet<>())
               .add(seat[1]);
        }

        int ans = (n - map.size()) * 2;

        for(Set<Integer> a:map.values()){
            boolean left=!a.contains(2) && !a.contains(3) && !a.contains(4) && !a.contains(5);
            boolean mid= !a.contains(4) && !a.contains(5) && !a.contains(6) && !a.contains(7);
            boolean right= !a.contains(6) && !a.contains(7) && !a.contains(8) && !a.contains(9);

            if(left && right) ans+=2;
            else if(mid || left || right) ans+=1;
        }

        return ans;
    }
}