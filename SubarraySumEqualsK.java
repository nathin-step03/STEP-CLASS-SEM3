import java.util.*;
public class SubarraySumEqualsK {
    static int subarraySum(int[] nums,int k){Map<Integer,Integer> counts=new HashMap<>();counts.put(0,1);int sum=0,total=0;for(int x:nums){sum+=x;total+=counts.getOrDefault(sum-k,0);counts.put(sum,counts.getOrDefault(sum,0)+1);}return total;}
    public static void main(String[] args){System.out.println(subarraySum(new int[]{1,1,1},2));}
}
