class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int left=0, right=m;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(matrix[mid][n]>=target && matrix[mid][0]<=target){
                return binarySearch(matrix[mid],target);
            }else if(matrix[mid][n]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return false;
    }

    static boolean binarySearch(int[] nums,int target){
        int left=0, right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}