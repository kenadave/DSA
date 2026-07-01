Whenever you see a problem asking you to modify an array in-place based on a condition, you should immediately think of this pattern.

The Core PatternYou maintain two pointers that move at different speeds or under different conditions:The Slow Pointer (k or uniqueIndex): Tracks the boundary of your "valid" or "processed" zone. 
It only moves when you find a valid element that needs to be kept.The Fast Pointer (i): Scans through every element of the array one by one.

[ 1,  2,  2,  3,  4 ]
  ▲   ▲
  │   └─── Fast Pointer (i): Scans all elements
  └─────── Slow Pointer (k): Tracks where the next unique element goes


Template for In-Place Array ModificationsAlmost every "in-place array removal/modification" problem can be solved using this exact structural template:

public int modifyArray(int[] nums) {
    if (nums.length == 0) return 0; // Guard clause for safety
    
    int slow = START_POSITION; // Usually 0 or 1
    
    for (int fast = START_POSITION; fast < nums.length; fast++) {
        // Condition changes based on the problem requirements
        if (isValidElement(nums, fast)) { 
            nums[slow] = nums[fast]; // Write data to the valid zone
            slow++;                  // Expand the valid zone
        }
    }
    return slow; // 'slow' usually equals the new length 'k'
}




3 LeetCode Problems using this Exact PatternYou can master this pattern by practicing these three variations, moving from easiest to hardest:

1. Remove Element (LeetCode 27)The Goal: Remove all instances of a specific value val in-place.The Shift: The fast pointer scans everything. 
The slow pointer only moves when nums[fast] != val.

2. Move Zeroes (LeetCode 283)The Goal: Move all 0s to the end of the array while maintaining the relative order of non-zero elements.The Shift: The fast pointer scans everything. 
The slow pointer only moves when nums[fast] != 0, swapping elements to push zeroes to the back.

3. Remove Duplicates from Sorted Array II (LeetCode 80)The Goal: Remove duplicates so that unique elements can appear at most twice.
The Shift: The fast pointer compares the current element not just to the previous one, but to the element two positions behind the slow pointer (nums[fast] != nums[slow - 2]).
