class Solution {
    int[] arr=new int[128];
    public int lengthOfLongestSubstring(String s) {
        int slen = s.length(), start = 0, maxLen = 0, c = 0;
        if(slen < 2)
            return slen;
        for(int x = 0; x < slen; x ++){
            c = s.charAt( x );
            if( arr[ c ] > 0 ){
                maxLen = Math.max( maxLen, x - start);
                for(; start < slen && start < arr[ c ]; start ++)
                    arr[ s.charAt( start )] = 0;
            }
            arr[c] = x+1;
        }
        maxLen = Math.max(maxLen, slen - start);
        return maxLen;
    }
}
