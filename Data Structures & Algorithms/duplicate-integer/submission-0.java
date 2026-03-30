class Solution {
public boolean hasDuplicate(int[] nums) {
        //create hasset to store elements in array
        HashSet<Integer> seenNumbers = new HashSet<>();

        //iterate through each element
        for(int num : nums){
             //check if element already exists in hashset
             if (seenNumbers.contains(num)){
                return true; //duplicate found
             }
             //add element to hashset
             seenNumbers.add(num);

        }
       
       return false; //no duplicate found
    }
};