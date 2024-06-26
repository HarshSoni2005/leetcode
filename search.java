class Solution {
    public int search(int[] num, int target) {
        int start = 0;
        int end = num.length - 1; // Change this line
        while(start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == target) {
                return mid;
            }
            if (num[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.print(new Solution().search(num, target));
    }
}