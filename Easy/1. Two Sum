class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map=new HashMap<Integer,Integer>();
        map.put(nums[0],0);
        for(int x=1; x<nums.length; x++){
            if(map.containsKey(target-nums[x]))
                return new int[]{map.get(target-nums[x]),x};
            map.put(nums[x],x);
        }
        return null;
    }
}
