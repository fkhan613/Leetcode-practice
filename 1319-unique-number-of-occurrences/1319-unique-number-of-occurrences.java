class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        //hashamp that stores the number of occurences of each 
        HashMap<Integer, Integer> seenNums = new HashMap<>();
        HashSet<Integer> seenNumOccurences = new HashSet<>();

        //loop through the array and count the number of occurences each element has
        for(int i = 0; i < arr.length; i++){

            //check if the current element in already in the hashmap
            if(seenNums.containsKey(arr[i])){
                //if so, increment the value
                int newCount = seenNums.get(arr[i]);
                newCount += 1;
                seenNums.put(arr[i], newCount);
            } else{
                //if its not in the hashmap, add it
                seenNums.put(arr[i], 1);
            }
        }

        //now, we wanna see if there are any values in the hashmap that are the same
        for(int number : seenNums.values()){
            if(!seenNumOccurences.add(number)){
                return false;
            }
        }

        return true;
    }
}