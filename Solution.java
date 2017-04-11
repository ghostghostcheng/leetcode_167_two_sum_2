package leetcode_167_two_sum_2;

public class Solution {
	// Method 2, more efficient
	public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1, -1};
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
	
	// Method 1
	/*
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1, -1};
        boolean flag = false;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] > target) {
                    break;
                } else if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        return result;
    }*/
}
