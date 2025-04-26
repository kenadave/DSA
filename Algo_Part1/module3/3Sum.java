package assignments.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, -2, -1 };
		Arrays.sort(nums);
		Set<List<Integer>> lst = new HashSet<>();
		List<List<Integer>> arrlst = new ArrayList<>();
		lst = getPairs(nums, lst);
		arrlst = new ArrayList<>(lst);
		System.out.println(arrlst);
	}

	private static Set<List<Integer>> getPairs(int[] nums, Set<List<Integer>> lst) {
		int n = nums.length;
		for(int i=0;i<n-2;i++) {
			if(nums[i]>0) {
				break;
			}
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			for(int j=i+1;j<n-1;j++) {
				if(j>i+1 && nums[j]==nums[j-1]) {
					continue;
				}
				int target=-(nums[i]+nums[j]);
				int left=j+1;
				int right=n-1;
				while(left<=right) {
					int mid=left+(right-left)/2;
					if(nums[mid]==target) {
						left++;
						right--;
						lst.add(Arrays.asList(nums[i],nums[j],nums[mid]));
					}else if(nums[mid]<target) {
						left++;
					}else {
						right--;
					}
				}
			}
		}
		return lst;
	}
	
	
}
