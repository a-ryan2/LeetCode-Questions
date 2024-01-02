class Solution {
    public static List<List<Integer>> findMatrix(int[] A) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = A.length, count[] = new int[n + 1];
        for (int a : A) {
            if (res.size() < ++count[a])
                res.add(new ArrayList<>());
            res.get(count[a]-1).add(a);
        }
        return res;
    }
}