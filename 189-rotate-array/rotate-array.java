class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
      for(int i=0; i<nums.length/2; i++){
        int tem=nums[i];
        nums[i]=nums[nums.length-1-i];
        nums[nums.length-1-i]=tem;
      }  
        for(int i=0; i<k/2; i++){
            int temp=nums[i];
            nums[i]=nums[k-1-i];
            nums[k-1-i]=temp;

        }int j=nums.length-1;
        int i=k;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
        
        
    }
}