class Solution {
    public int passThePillow(int n, int time) {
        int divisor=n-1;
        int group=time/divisor;
        int offset=time%divisor;

        return group%2 == 0
        ? 1+offset
        : n-offset;
    }
}
