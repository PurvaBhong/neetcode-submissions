class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            //calculae match of current number
            int match = target - nums[i];

            //check if match is already present in hashmap
            if(map.containsKey(match)){
                // if found return index of current num and its match
                return new int[] {map.get(match),i};
            }
            // else add current number and its index in hashmap
            map.put(nums[i], i);
        }   
        //return an empty array if no solution found
        return new int[] {}; 
}
}
