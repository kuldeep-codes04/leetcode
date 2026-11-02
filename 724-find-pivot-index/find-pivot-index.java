class Solution {
    public int pivotIndex(int[] nums) {
        int i;
        for( i=0; i<nums.length; i++){
            int j=i-1;
            int k=i+1;
            int sumleft=0;
            int sumright=0;
            while(j>=0 || k<=nums.length-1){
               if(j>=0){ sumleft+=nums[j]; j--;}
                if(k<nums.length){ sumright+=nums[k];k++;}
                
            

            }
            if(sumleft==sumright){
                    return i;
                }
        }
        return -1;
    }
}