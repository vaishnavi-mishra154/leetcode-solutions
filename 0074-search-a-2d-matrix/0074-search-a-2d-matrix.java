class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] a: matrix)
        {
            for(int n: a)
            if(n == target)
            {
                return true;
            }
        }
        return false;
    }
}