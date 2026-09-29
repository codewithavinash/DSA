public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int,int> map = new Dictionary<int,int>();
        //
        for(int i=0; i<nums.Length; i++){
            int currentNum = nums[i];
            int complement = target - currentNum;
            //find the num if already present in the map
            if(map.ContainsKey(complement)){
                return new int[]{map[complement], i};
            }
            //otherwise store index of current num
            map[currentNum]=i;
        }
        return Array.Empty<int>();
    }
}
