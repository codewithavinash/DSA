public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> map = new Dictionary<int,int>();
        int n = nums.Length;
        foreach(int num in nums){
            //if map already contains that num, increment its value count
            if(map.ContainsKey(num)){
                map[num]++;
            }
            else{
                //Num occurs for the very first time
                map[num]=1;
            }
            //if count is greater
            if(map[num]>n/2){
                return num; //return number not index
            }
        }
        return -1;
    }
}