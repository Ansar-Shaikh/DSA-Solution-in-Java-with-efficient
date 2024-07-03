class  SuffledArray {
    public int[] shuffle(int[] nums, int n) {
        int suffled[]= new int [nums.length] ;
        for (int i=0;i<n;i++){
            suffled[2*i]=nums[i];
            suffled[2*i+1]=nums[n+i];
        }
        return suffled;
    }
}