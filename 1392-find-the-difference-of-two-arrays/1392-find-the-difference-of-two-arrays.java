class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();  
        List<Integer> ans2 = new ArrayList<Integer>();  
        HashSet<Integer> num1Unique = new HashSet<Integer>();
        HashSet<Integer> num2Unique = new HashSet<Integer>();

        for(int n : nums1){
            num1Unique.add(n);
        }
        for(int n : nums2){
            num2Unique.add(n);
        }

        for(int n : num1Unique){

            if(!num2Unique.contains(n)){
                ans1.add(n);
            }
        }
        for(int n : num2Unique){

            if(!num1Unique.contains(n)){
                ans2.add(n);
            }
        }

        answer.add(ans1);
        answer.add(ans2);

        return answer;
    }
}