package appleorange;

/**
 *
 * @author Jeancy Thsibemba
 */
public class AppleOrange {
    /**
     *@param s ,starting position of the house
     *@param t ,end position of the house
     *@param a ,position of the apple tree
     *@param b ,position of the orange tree
     *@param apples , array representing different positions where apples fall
     *@param oranges , array representing different positions where apples fall
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
         int appleCount = 0;
         int orangeCount = 0;
         for (int i = 0; i < apples.length; i++) {
             if ((apples[i] + a <= t) && (apples[i] + a >= s)) {
                 appleCount +=1;
             }
         }
         for (int i = 0; i < oranges.length; i++) {
             if ((oranges[i] + b <= t) && (oranges[i] + b >= s)) {
                 orangeCount +=1;
             }
         }
         System.out.println(appleCount);
         System.out.println(orangeCount);
         

    }
    public static void main(String[] args) {
        int[] applesMM = {2,3,-4};
        int[] orangesNN = {3,-2,-4};
        AppleOrange.countApplesAndOranges(7, 10, 4, 12, applesMM, orangesNN);
        int[] applesM = {-2,2,1};
        int[] orangesN = {5,-6};
        AppleOrange.countApplesAndOranges(7, 11, 5, 15, applesM, orangesN);
    }
    
}
