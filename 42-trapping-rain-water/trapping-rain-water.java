class Solution {
    public int trap(int[] height) {
        int arrleft[]=new int[height.length];
        int arrright[]=new int[height.length];
        int n=height.length;
        int leftmax=height[0];
        arrleft[0]=height[0];
        arrright[n-1]=height[n-1];
        int rightmax=height[height.length-1];
        for(int i=1; i<n; i++){
            int currr=height[i];
            leftmax=Math.max(currr,leftmax);
            arrleft[i]=leftmax;
        }
        for(int i=n-2; i>=0; i--){
            int curl=height[i];
            rightmax=Math.max(rightmax,curl);
            arrright[i]=rightmax;
        }
        int trap=0;
        for(int i=0; i<n; i++){
            int curtrap=((Math.min(arrright[i],arrleft[i]))-height[i]);
           if(curtrap>0) {trap+=curtrap;}
        }
        return trap;
        
    }
}