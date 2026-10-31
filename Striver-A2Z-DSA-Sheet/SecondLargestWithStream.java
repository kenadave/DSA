class SecondLargestWithStream {
    public int secondLargestElement(int[] nums) {
        return Arrays.stream(nums)
                     .boxed()
                     .distinct()
                     .sorted(Comparator.reverseOrder())
                     .skip(1)
                     .findFirst()
                     .orElse(-1);

    }
}
