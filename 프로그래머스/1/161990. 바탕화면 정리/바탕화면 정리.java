class Solution {
    public int[] solution(String[] wallpaper) {
        int top = wallpaper.length, left = wallpaper[0].length();
        int bottom = -1, right = -1;
        int i = 0;
        for (String w : wallpaper) {
            int fidx = w.indexOf("#");
            int lidx = w.lastIndexOf("#");
            if (fidx != -1) {
                top = Math.min(top,i);
                left = Math.min(left,fidx);
                bottom = Math.max(bottom,i+1);
                right = Math.max(right,lidx+1);
            }
            i++;
        }
        
        return new int[]{top,left,bottom,right};

    }
}