package leetcode.q2269;
//Find the K-Beauty of a Number


class Solution {
    public boolean isBeautyNumber(int num, String sumNum) {
        int tempNum = Integer.parseInt(sumNum);
        if (tempNum == 0)
            return false;

        return num % Integer.parseInt(sumNum) == 0;
    }
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int start = 0;
        String strNum = num + "";
        for (int i = 0; i <= strNum.length() - k; i++) {
             if (isBeautyNumber(num, strNum.substring(start, start+k)))
                 count++;
            start++;
        }
        return count;
    }
}