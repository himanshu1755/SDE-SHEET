package sheet.Day3;

//169. Majority Element

//https://leetcode.com/problems/majority-element/

public class D2P3 {
    public int majorityElement(int[] nums) {
        int count =0,e =0;

        for(int i=0;i<nums.length;i++){
            if(count == 0)
                e = nums[i];
            if(e == nums[i])
                count = count +1;
            else
                count =count -1;

        }
        return e;

    }
}
