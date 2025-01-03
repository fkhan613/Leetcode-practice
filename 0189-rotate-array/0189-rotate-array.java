import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {

        Deque<Integer> deque = new ArrayDeque<>();
        int temp;

        for(int i = 0; i < nums.length; i++){
            deque.add(nums[i]);
        }
        
        for(int j = 1; j <= k; j++){
            temp = deque.removeLast();
            deque.addFirst(temp);
        }

        int index = 0;
        for(int val : deque){
            nums[index++] = val;
        }
    }
}