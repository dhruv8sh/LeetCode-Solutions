class Solution {
    public String convert(String s, int numRows) {
        int len=s.length();
        if(len==1 || numRows==1 || numRows>=len)
            return s;
        int x=0, y=0, skip=2*(numRows-1);
        StringBuilder sb=new StringBuilder();
        while(x<len){
            sb.append(s.charAt(x));
            x+=skip;
        }
        for(x=1; x<numRows-1; x++){
            y=x;
            while(y<len){
                sb.append(s.charAt(y));
                if(y+2*(numRows-x-1)<len)
                    sb.append(s.charAt(y+2*(numRows-x-1)));
                y+=skip;
            }
        }
        while(x<len){
            sb.append(s.charAt(x));
            x+=skip;
        }
        return sb.toString();
    }
}
