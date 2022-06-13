class Solution {
    int start=0, end=1;
    char c[];
    public String longestPalindrome(String s) {
        c=s.toCharArray();
        for(int x=1; x<c.length-(end-start)/2; x++){
            checkPalin(x-1,x+1);
            checkPalin(x-1,x);
        }
        return s.substring(start,end);
    }
    void checkPalin(int a, int b){
        while(a>=0 && b<c.length){
            if(c[a]!=c[b])
                break;
            --a;
            ++b;
        }
        if(end-start>=b-a-1)
            return;
        end=b;
        start=a+1;
    }
}
