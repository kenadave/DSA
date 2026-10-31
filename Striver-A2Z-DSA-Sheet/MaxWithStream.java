class MaxWithStream{
  public int getLargest(int[] nums){
    return Arrays.stream(nums).max().orElse(0);
  }
}
