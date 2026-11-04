class InterSectionOfTwoUnSortedArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = Arrays.stream(nums1)
                                .boxed()
                                .collect(Collectors.toSet());
        return Arrays.stream(nums2)
                     .filter(st::contains)
                     .distinct()
                     .toArray();
    }
}

//While set1.retainAll(set2) is highly convenient and readable when you are already working purely with Objects (like Set<String>), 
//it is highly inefficient when dealing with primitive arrays like int[]. The manual looping approach remains the gold standard for performance.
