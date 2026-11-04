class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k=0;
        int a=0;
        for(int i=0; i<nums.length; i++){
            if(val==nums[i]){
               continue;
            }
            else { nums[k]=nums[i];
                k++;
                a++;}
        }
        return a;
    }
}