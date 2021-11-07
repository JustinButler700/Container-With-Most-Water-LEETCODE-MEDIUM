//Justin Butler
// 11/7/2021
class Solution {
    public int maxArea(int[] height) {
        int max = 0; // holds current maximum volume
        int left = 0, right = height.length-1; // holds pointers to the two ends of our water container
        while(left < right)
        {
           int minHeight = 0;
           if(height[left]<height[right])
           {
               minHeight = height[left]; 
               max = Math.max(minHeight*(right-left), max);
               left++;
           }
           else
           {
               minHeight = height[right];
               max = Math.max(minHeight*(right-left), max);
               right--;
           }
        }
        return max;
    }
}
