import java.util.Arrays;
public class ProductOfArrayExceptSelf {
    static int[] productExceptSelf(int[] nums){int n=nums.length;int[] ans=new int[n];int left=1;for(int i=0;i<n;i++){ans[i]=left;left*=nums[i];}int right=1;for(int i=n-1;i>=0;i--){ans[i]*=right;right*=nums[i];}return ans;}
    public static void main(String[] args){System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));}
}
