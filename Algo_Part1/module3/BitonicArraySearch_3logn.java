public class BitonicArraySearch_3logn {

	public static void main(String[] args) {
		int[] bitonicArray2 = {1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
		int[] bitonicArray3 = {1, 3, 5, 10, 9, 8, 6, 4, 2, 0};
		int[] bitonicArray4 = {1, 3, 5, 7, 9, 10, 6, 4, 2, 0};
		int[] bitonicArray = {1, 5,2};
        int target = 2;

        int index = bitonicSearch(bitonicArray, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }

	}

	private static int bitonicSearch(int[] bitonicArray, int target) {
		int peak = findPeak(bitonicArray);
		int ascIndex = -1;
		int dscIndex = -1;
		if(peak!=-1) {
			ascIndex = searchInAsc(bitonicArray,target,peak);
			if(ascIndex!=-1) {
				return ascIndex;
			}
		}
		if(peak!=-1) {
			dscIndex = searchInDsc(bitonicArray,target,peak);
		}
		return dscIndex;
	}

	private static int searchInDsc(int[] bitonicArray, int target, int peak) {
		int left=peak;
		int right=bitonicArray.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(target==bitonicArray[mid]) {
				return mid;
			}else if(target<bitonicArray[mid]) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
		
	}

	private static int searchInAsc(int[] bitonicArray, int target, int peak) {
		int left=0;
		int right=peak;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(target==bitonicArray[mid]) {
				return mid;
			}else if(target<bitonicArray[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
	}

	private static int findPeak(int[] bitonicArray) {
		int left = 0;
		int right = bitonicArray.length-1;
		int peak=-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if((mid==bitonicArray.length-1 || bitonicArray[mid]>=bitonicArray[mid+1]) && (mid==0 || bitonicArray[mid]>=bitonicArray[mid-1])) {
				peak=mid;
				return peak;
			}else if(mid>0 && bitonicArray[mid]<bitonicArray[mid-1]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return peak;
	}

}
