class Solution {
        boolean[][] cache;
        char sc[], pc[];
    public boolean isMatch(String s, String p) {
        sc=s.toCharArray();
        pc=p.toCharArray();
        cache=new boolean[sc.length+1][pc.length];
        for(int x=1; x<pc.length && pc[x]=='*'; x+=2)
                cache[sc.length][x]=true;
        return ans(cache.length-2,cache[0].length-1);
    }
    boolean ans(int x, int y){
        if(x==-1 && y==-1)
            return true;
        else if(y==-1)
            return false;
        else if(x==-1)
            return cache[sc.length][y];
        else if(pc[y]=='*'){
            if(ans(x,y-2))
                return true;
            else if((pc[y-1]=='.' || sc[x]==pc[y-1]) && ans(x-1,y))
                return true;
            else return false;
        }
        else if((pc[y]=='.' || sc[x]==pc[y]) && ans(x-1,y-1))
            return true;
        return false;
    }
}
