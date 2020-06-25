package week3.test;

import java.util.Scanner;

public class LeetCode_BEM {

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // if the two halves agree on the majority element, return it.
//        if (left == right) {
//            return left;
//        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah vote: ");
         int voteAmount = sc.nextInt();

        LeetCode_BEM vote = new LeetCode_BEM();
        int fillVote[] = new int[voteAmount];
        System.out.println("Choose your candidate by typing the number of candidate: ");
        for (int i = 0; i < voteAmount; i++) {
            System.out.print("Participant " + (i + 1) + ": ");
            fillVote[i] = sc.nextInt();
        }
        //System.out.println("The winner is " + vote.determineWinnerBF(fillVote));
        System.out.println("The winner is " + vote.majorityElement(fillVote));
    }
}
