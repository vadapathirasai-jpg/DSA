class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            pq.offer(x);
        }
        while( pq.size() > 1 ){
            int x = pq.poll();
            int y = pq.poll();
            int z = Math.abs(x - y);
            if( z != 0 ){
                pq.offer(z);
            }
        }
        if(pq.size() == 0) {
            return 0;
        }
        return pq.poll();
    }
}