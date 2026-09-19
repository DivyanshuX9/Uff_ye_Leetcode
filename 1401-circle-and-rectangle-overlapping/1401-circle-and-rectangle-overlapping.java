class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int p1=Math.max(x1,Math.min(xCenter,x2));
        int p2=Math.max(y1,Math.min(yCenter,y2));

        p1=xCenter-p1;
        p2=yCenter-p2;

        return p1*p1+p2*p2<=radius*radius;
     }
}