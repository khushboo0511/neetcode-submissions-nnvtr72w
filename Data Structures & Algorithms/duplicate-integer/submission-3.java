class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;

        // int[] freq = new int[nums.length+1];
        // for (int num:nums) {
        //     if (freq[num] == 0) {
        //         freq[num] += 1;
        //     } else {
        //         return true;
        //     }
        // }
        //     return false;
    }
}