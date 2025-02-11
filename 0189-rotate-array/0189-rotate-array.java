import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {

        Deque<Integer> deque = new ArrayDeque<>();

        //add the elements to the arraydque first
        for(int n : nums){
            deque.addLast(n);
        }

        //move the last k elements to the front
        for(int i = 0; i < k; i++){
            int popped = deque.removeLast();
            deque.addFirst(popped);
        } 

        for(int i = 0; i < nums.length; i++){
            nums[i] = deque.removeFirst();
        }
    }
}