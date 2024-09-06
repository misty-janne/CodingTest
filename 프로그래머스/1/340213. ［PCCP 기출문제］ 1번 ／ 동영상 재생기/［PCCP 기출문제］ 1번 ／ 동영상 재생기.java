class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int len = toSecond(pos);
        for (String c : commands) {
            if (toSecond(op_start) <= len && len < toSecond(op_end)) {
                len = toSecond(op_end);
            }
            len = c.equals("next") ? len+10 : len-10;
            if (toSecond(op_start) <= len && len < toSecond(op_end)) {
                len = toSecond(op_end);
            }
            if (len < 0) len = 0;
            if (toSecond(video_len) < len) len = toSecond(video_len);
        }
        return String.format("%02d", len/60)+":"+String.format("%02d", len%60);
    }
    public int toSecond(String str) {
        return (Integer.valueOf(str.split(":")[0])*60) + Integer.valueOf(str.split(":")[1]);
    }

}