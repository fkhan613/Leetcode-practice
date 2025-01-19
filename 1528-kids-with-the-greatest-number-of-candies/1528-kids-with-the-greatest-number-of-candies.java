class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> result = new ArrayList<>();

        //get the max
        for(int i = 0; i < candies.length; i++){

            if(candies[i] > max){
                max = candies[i];
            }

        }

        //go through the candies list, and see which kids have more candies than max after adding extra candies
        for(int i = 0; i < candies.length; i++){

            if((candies[i] + extraCandies) >= max){
                result.add(true);
            } else{
                result.add(false);
            }
        }

        return result;
        
    }
}