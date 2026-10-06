class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int a = intervals[0][0];
        int b = intervals[0][1];

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 1; i < intervals.length; i++){
            int x = intervals[i][0];
            int y = intervals[i][1];
            if( x <= b ){
                b = Math.max(b, y);
            }
            else{
                ArrayList<Integer> res = new ArrayList<>();
                res.add(a);
                res.add(b);
                ans.add(res);
                a = x;
                b = y;
            }
        }
        int[][] result = new int[ans.size()+1][2];
        int i = 0;
        for(ArrayList<Integer> g : ans){
            int q = g.get(0);
            int w = g.get(1);
            result[i][0] = q;
            result[i][1] = w;
            i++;
        }
        result[i][0] = a;
        result[i][1] = b;
        return result;
    }
}