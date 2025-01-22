class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean leftEmpty;
        boolean rightEmpty;
        boolean currentEmpty;

        for(int i = 0; i < flowerbed.length; i++){

            if(n == 0){
                return true;
            }

            //check if current plot if empty
            currentEmpty = (flowerbed[i] == 0);

            //check if current plot empty
            if(currentEmpty){

                //check if left plot s empty
                if(i-1 >=0){
                    leftEmpty = (flowerbed[i-1] == 0);
                } else{
                    leftEmpty = currentEmpty;
                }

                //check if the right plot is empty
                if(i+1 < flowerbed.length){
                    rightEmpty = (flowerbed[i+1] == 0);
                } else{
                    rightEmpty = currentEmpty;
                }

                //do a final check and see if we have all three empty
                if(leftEmpty && rightEmpty && currentEmpty){
                    flowerbed[i] = 1;
                    n--;
                }
            }

        }

        return n == 0;
        
    }
}