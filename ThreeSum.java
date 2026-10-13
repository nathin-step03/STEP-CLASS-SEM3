import java.util.*;
public class ThreeSum {
    static List<List<Integer>> threeSum(int[] nums){Arrays.sort(nums);List<List<Integer>> out=new ArrayList<>();for(int i=0;i<nums.length-2;i++){if(i>0&&nums[i]==nums[i-1])continue;int l=i+1,r=nums.length-1;while(l<r){int sum=nums[i]+nums[l]+nums[r];if(sum==0){out.add(Arrays.asList(nums[i],nums[l],nums[r]));int a=nums[l],b=nums[r];while(l<r&&nums[l]==a)l++;while(l<r&&nums[r]==b)r--;}else if(sum<0)l++;else r--;}}return out;}
    public static void main(String[] args){System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));}
}
